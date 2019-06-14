package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class DreamEater extends Move
{
	public DreamEater()
	{
		super("Dream Eater", PokemonGame.Psychic, 1, 15, 100, 100, 1, 0);
	}
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
		if(defender.getCondition().equals("Asleep"))
		{
			double Damage = 0;
			//Random r = new Random();
			int randMax = 100;
			int randMin = 1;
			int hit = genrand(randMin, randMax);
			boolean critical = (genrand(1, 1000)/10 < attacker.getCriticalHitChanceMultiplier(0));
			if(!attacker.getFlinched() && !defender.isProtected())
			{
				if(!(getAttackType() == 2) && hit <= (getAccuracy() == 0? 100:  getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier())))
				{
					if(!critical)
					{
						randMax = 100;
						randMin = 85;
						int randNum = genrand(randMin, randMax);
						//Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) / 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
						double AttackStat = attacker.getSpAttack() * attacker.getSpecialAttackMultiplier();
						double DefenseStat = defender.getSpDefense() * defender.getSpecialDefenseMultiplier();
						double STAB;
						try{
							STAB = (attacker.getType().get(0).getID().equals(getPokeType().getID())? 1.5 : (attacker.getType().get(1).equals(null))? 1 :(attacker.getType().get(1).getID().equals(getPokeType().getID()))? 1.5 : 1);
						}catch(NullPointerException e)
						{
							STAB = attacker.getType().get(0).getID().equals(getPokeType().getID())? 1.5 : 1.0;
						}
						double DamageMultiplier = getPokeType().getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));
						if(DamageMultiplier > 1.0)
							System.out.println("It's super effective!");
						else if(DamageMultiplier < 1.0 && DamageMultiplier > 0.0)
							System.out.println("It's not very effective!");
						else if(DamageMultiplier == 0.0)
							System.out.println(defender.getPoke().name + " is immune!");
						Damage = ((((2 * attacker.getLevel() / 5 + 2) * AttackStat * getPower() / DefenseStat) / 50) + 2) * STAB * DamageMultiplier * randNum / 100;
						if(Damage > 0)
							System.out.println(defender.getPoke().name + " took damage!");
					}
					else
					{
						randMax = 100;
						randMin = 85;
						int randNum = genrand(randMin, randMax);
						//Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) / 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
						double AttackStat = attacker.getSpAttack() * attacker.getSpecialAttackMultiplier();
						double DefenseStat = defender.getSpDefense();
						double STAB;
						try{
							STAB = (attacker.getType().get(0).getID().equals(getPokeType().getID())? 1.5 : (attacker.getType().get(1).equals(null))? 1 :(attacker.getType().get(1).getID().equals(getPokeType().getID()))? 1.5 : 1);
						}catch(NullPointerException e)
						{
							STAB = attacker.getType().get(0).getID().equals(getPokeType().getID())? 1.5 : 1.0;
						}
						double DamageMultiplier = getPokeType().getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));
						if(DamageMultiplier > 1.0)
							System.out.println("It's super effective!");
						else if(DamageMultiplier < 1.0 && DamageMultiplier > 0.0)
							System.out.println("It's not very effective!");
						else if(DamageMultiplier == 0.0)
							System.out.println(defender.getPoke().name + " is immune!");
						Damage = ((((2 * attacker.getLevel() / 5 + 2) * AttackStat * getPower() / DefenseStat) / 50) + 2) * STAB * DamageMultiplier * randNum / 100;
						if(Damage > 0)
						{
							Damage *= 2;
							System.out.println(defender.getPoke().name + " took damage!");
							System.out.println("It's a critical hit!");
						}	
					}
					//defender.setHP(defender.getCurrentHP() - (int)Damage);
					secondaryEffect(attacker, defender, (int)Math.round(Damage));
				}
				if(getAttackType() == 2 && hit <= (getAccuracy() == 0? 100 : getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier())))
					secondaryEffect(attacker, defender, (int)Math.round(Damage));
				if(hit > getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()) && getAccuracy() != 0)
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
			defender.setLastDamageTaken((int)Math.round(Damage));
			lowerCurrentPP();
			return (int)Math.round(Damage);
		}
		else
		{
			System.out.println("But it failed!");
			lowerCurrentPP();
			return 0;
		}
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Only works if the target is asleep.  Restores 50% of the damage dealt and is restored to the user.
	}
}
