package moves;

import pokemon.PokeType;
import pokemon.SeenPokemon;

import java.util.Random;

public class Move 
{
	
	private PokeType typeOfMove;
	public String ID;
	//public int attack;
	private int power;
	private int currentPP;
	//public int damage;
	private int accuracy; //percentage
	private int maxPP;
	private int attackType; //0 = physical, 1 = special, 2 = status
	private int turnCompletion;
	private int currentTurnCompletion;
	private int priority;
	private int TMnumber;
	private int HMnumber;
	private boolean isHM = false;
	private boolean isTM = false;
	
	public Move(String id, PokeType type, int AT, int pp, int power, int acu, int TC, int Pri)
	{
		this.power = power;
		accuracy = acu;
		maxPP = pp;
		currentPP = pp;
		turnCompletion = TC;
		currentTurnCompletion = TC;
		attackType = AT;
		typeOfMove = type;
		ID = id;
		priority = Pri;
	}
	
	public Move() 
	{


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
			if(!(this.attackType == 2) && hit <= (accuracy == 0? 100:  accuracy * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier())))
			{
				if(!critical)
				{
					randMax = 100;
					randMin = 85;
					int randNum = genrand(randMin, randMax);
					//Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) / 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
					double AttackStat = this.attackType == 0? attacker.getAttack() * attacker.getAttackMultiplier(): attacker.getSpAttack() * attacker.getSpecialAttackMultiplier();
					double DefenseStat = this.attackType == 0? defender.getDefense() * defender.getDefenseMultiplier(): defender.getSpDefense() * defender.getSpecialDefenseMultiplier();
					double STAB;
					try{
						STAB = (attacker.getType().get(0).getID().equals(this.typeOfMove.getID())? 1.5 : (attacker.getType().get(1).equals(null))? 1 :(attacker.getType().get(1).getID().equals(this.typeOfMove.getID()))? 1.5 : 1);
					}catch(NullPointerException e)
					{
						STAB = attacker.getType().get(0).getID().equals(this.typeOfMove.getID())? 1.5 : 1.0;
					}
					double DamageMultiplier = this.typeOfMove.getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));
					if(DamageMultiplier > 1.0)
						System.out.println("It's super effective!");
					else if(DamageMultiplier < 1.0 && DamageMultiplier > 0.0)
						System.out.println("It's not very effective!");
					else if(DamageMultiplier == 0.0)
						System.out.println(defender.getPoke().name + " is immune!");
					Damage = ((((2 * attacker.getLevel() / 5 + 2) * AttackStat * this.power / DefenseStat) / 50) + 2) * STAB * DamageMultiplier * randNum / 100;
					if(Damage > 0)
						System.out.println(defender.getPoke().name + " took damage!");
				}
				else
				{
					randMax = 100;
					randMin = 85;
					int randNum = genrand(randMin, randMax);
					//Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) / 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
					double AttackStat = this.attackType == 0? attacker.getAttack() * attacker.getAttackMultiplier(): attacker.getSpAttack() * attacker.getSpecialAttackMultiplier();
					double DefenseStat = this.attackType == 0? defender.getDefense(): defender.getSpDefense();
					double STAB;
					try{
						STAB = (attacker.getType().get(0).getID().equals(this.typeOfMove.getID())? 1.5 : (attacker.getType().get(1).equals(null))? 1 :(attacker.getType().get(1).getID().equals(this.typeOfMove.getID()))? 1.5 : 1);
					}catch(NullPointerException e)
					{
						STAB = attacker.getType().get(0).getID().equals(this.typeOfMove.getID())? 1.5 : 1.0;
					}
					double DamageMultiplier = this.typeOfMove.getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));
					if(DamageMultiplier > 1.0)
						System.out.println("It's super effective!");
					else if(DamageMultiplier < 1.0 && DamageMultiplier > 0.0)
						System.out.println("It's not very effective!");
					else if(DamageMultiplier == 0.0)
						System.out.println(defender.getPoke().name + " is immune!");
					Damage = ((((2 * attacker.getLevel() / 5 + 2) * AttackStat * this.power / DefenseStat) / 50) + 2) * STAB * DamageMultiplier * randNum / 100;
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
			if(this.attackType == 2 && hit <= (accuracy == 0? 100 : accuracy * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier())))
				secondaryEffect(attacker, defender, (int)Math.round(Damage));
			if(hit > accuracy * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()) && accuracy != 0)
			{
				System.out.println(defender.pokemon.name + " avoided the move.");
				System.out.print(hit + " > ");
				System.out.println(accuracy * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()));
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
	
	public void secondaryEffect(SeenPokemon Attacker , SeenPokemon Defender, int Damage)
	{
		
	}
	
	public int getPriority()
	{
		return priority;
	}
	
	public PokeType getPokeType()
	{
		return typeOfMove;
	}
	
	public void setIsHM()
	{
		isHM = true;
	}
	public boolean getIsHM()
	{
		return isHM;
	}
	public void setIsTM()
	{
		isTM = true;
	}
	public boolean getIsTM()
	{
		return isTM;
	}
	
	public int getCurrentPP()
	{
		return currentPP;
	}
	
	public void lowerCurrentPP()
	{
		currentPP--;
	}
	
	public void refillPP()
	{
		currentPP = maxPP;
	}
	
	public int getMaxPP()
	{
		return maxPP;
	}
	
	public int getAccuracy()
	{
		return accuracy;
	}
	
	public int getMaxTurnCompletion()
	{
		return turnCompletion;
	}
	
	public int getCurrentTurnCompletion()
	{
		return currentTurnCompletion;
	}
	
	public int getAttackType()
	{
		return attackType;
	}
	
	public void setCurrentTurnCompletion(int turns)
	{
		currentTurnCompletion = turns;
	}
	
	public int getPower()
	{
		return power;
	}
	
	public static int genrand(int min, int max)
	{
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public String toString()
	{
		String obj = "";
		obj = ID + " (" + typeOfMove.getID() + ") PP:" + currentPP + "/" + maxPP;
		return obj;
	}
}
