package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class FurySwipes extends Move
{
	public FurySwipes()
	{
		super("Fury Swipes", PokemonGame.Normal, 0, 15, 18, 80, 1, 0);
	}
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
		double Damage = 0;
		int randMax = 100;
		int randMin = 1;
		int hit = genrand(randMin, randMax);
		if(!attacker.getFlinched() && !defender.isProtected())
		{
			if(hit <= getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()))
			{
				double chance = genrand(1,1000)/10.0;
				boolean critical = false;
				int timesHit = 0;	
				if(chance > 62.5)
				{
					timesHit = 2;
				}
				else if(chance > 25.0)
				{
					timesHit = 3;
				}
				else if(chance > 12.5)
				{
					timesHit = 4;
				}
				else if(chance > 0.0)
				{
					timesHit = 5;
				}
				randMax = 100;
				randMin = 85;
				int randNum = genrand(randMin, randMax);
				//Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) / 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
				double AttackStat = attacker.getAttack() * attacker.getAttackMultiplier();
				double DefenseStat = defender.getDefense() * defender.getDefenseMultiplier();
				double STAB;
				try{
					STAB = (attacker.getType().get(0).getID().equals(getPokeType().getID())? 1.5 : (attacker.getType().get(1).equals(null))? 1 :(attacker.getType().get(1).getID().equals(getPokeType().getID()))? 1.5 : 1);
				}catch(NullPointerException e)
				{
					STAB = attacker.getType().get(0).getID().equals(getPokeType().getID())? 1.5 : 1.0;
				}
				double DamageMultiplier = getPokeType().getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));
				for(int i = 0; i < timesHit; i++)
				{
					defender.setHP(defender.getCurrentHP() - (int)Math.round(Damage));
					defender.setLastDamageTaken(defender.getLastDamageTaken() + (int)Math.round(Damage));
					critical = (genrand(1, 1000)/10 < attacker.getCriticalHitChanceMultiplier(0));
					if(critical)
						DefenseStat = defender.getDefense();
					else
						DefenseStat = defender.getDefense() * defender.getDefenseMultiplier();
					randNum = genrand(randMin, randMax);
					Damage = ((((2 * attacker.getLevel() / 5 + 2) * AttackStat * getPower() / DefenseStat) / 50) + 2) * STAB * DamageMultiplier * randNum / 100;
					if(DamageMultiplier > 1.0)
						System.out.println("It's super effective!");
					else if(DamageMultiplier < 1.0 && DamageMultiplier > 0.0)
						System.out.println("It's not very effective!");
					else if(DamageMultiplier == 0.0)
						System.out.println(defender.getPoke().name + " is immune!");
					if(Damage > 0)
					{
						System.out.println(defender.getPoke().name + " took damage!");
						if(critical)
						{
							System.out.println("It's a critical hit!");
							Damage*=2;
						}
					}
				}
				System.out.println(defender.pokemon.name + " was hit " + timesHit + " times!");
				//defender.setHP(defender.getCurrentHP() - (int)Damage);
				//secondaryEffect(attacker, defender, (int)Damage);
			}
			if(hit > getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()))
			{
				System.out.println(defender.pokemon.name + " avoided the move.");
				System.out.print(hit + " > ");
				System.out.println(getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()));
			}
		}
		else if(attacker.getFlinched())
		{
			System.out.println(attacker.getPoke().name + " flinched!");
		}
		else
		{
			System.out.println(defender.getPoke().name + " avoided the move!");
		}
		lowerCurrentPP();
		return (int)Math.round(Damage);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Multihit move
	}
}
