package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Swift extends Move
{
	public Swift()
	{
		super("Swift", PokemonGame.Normal, 1, 20, 60, 0, 1, 0);
	}
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
		double Damage = 0;
		//Random r = new Random();
		int randMax = 100;
		int randMin = 1;
		int hit = genrand(randMin, randMax);
		boolean critical = (genrand(1, 1000)/10 < attacker.getCriticalHitChanceMultiplier(0));
		if(!attacker.getFlinched() && !defender.isProtected())
		{
				if(!critical)
				{
					randMax = 100;
					randMin = 85;
					int randNum = genrand(randMin, randMax);
					//Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) / 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
					double AttackStat = getAttackType() == 0? attacker.getAttack() * attacker.getAttackMultiplier(): attacker.getSpAttack() * attacker.getSpecialAttackMultiplier();
					double DefenseStat = getAttackType() == 0? defender.getDefense() * defender.getDefenseMultiplier(): defender.getSpDefense() * defender.getSpecialDefenseMultiplier();
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
					double AttackStat = getAttackType() == 0? attacker.getAttack() * attacker.getAttackMultiplier(): attacker.getSpAttack() * attacker.getSpecialAttackMultiplier();
					double DefenseStat = getAttackType() == 0? defender.getDefense(): defender.getSpDefense();
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
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Will not hit the target during fly or dig.
	}
}
