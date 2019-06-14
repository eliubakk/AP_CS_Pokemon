package pokemon;


import items.Item;

import java.util.*;

import red.PokemonGame;
import moves.Bind;
import moves.Clamp;
import moves.FireSpin;
import moves.Move;

@SuppressWarnings("unused")
public class SeenPokemon 
{
	private int level;
	private int EV[] = new int[6]; //0-255 per stat 510 > total
	private int IV[] = new int[6]; //01-31
	private int Base[] = new int[6]; // 0-HP, 1-Atk, 2-Def, 3-Sp. Atk, 4- Sp. Def, 5-Speed
	//public int BattleStats[];
	private int MaxHP;
	private int HP;
	private int lastDamageTaken = 0;
	private int lastMoveUsed = 5;
	public Poke pokemon;
	private int condition; //0-Nothing, 1-Asleep, 2-Poison, 3-Badly Poisoned, 4-Paralyzed, 5-Burned, 6-Frozen
	private int conditionDuration = 0;
	private int attack;
	private int defense;
	private int spAttack;
	private int spDefense;
	private int speed;
	private int accuracy;
	private int evasiveness;
	private int criticalHitChance = 0;
	private double CriticalHitMultiplier[] = new double[]{1.0/16, 1.0/8, 1.0/4, 1.0/3, 1.0/2};
	private int MultipliersIndex[] = new int[]{6,6,6,6,6,6,6}; //0-Attack, 1-defense, 2-Sp Attack,3-Sp Defense, 4-speed, 5-Evasiveness, 6- Accuracy
	private final double MainMultipliers[] = new double[]{.25, .29, .33, .4, .5, .66, 1, 1.5, 2, 2.5, 3, 3.5, 4}; //6 is +- zero levels
	private final double AccuracyMultipliers[] = new double[]{.33, .375, .428, .5, .6, .75, 1, 1.33, 1.66, 2, 2.33, 2.66, 3}; 
	private Move move1;
	private Move move2;
	private Move move3;
	private Move move4;
	private ArrayList<Move> moves = new ArrayList<Move>();
	Item heldItem;
	private boolean trapped = false;
	private String moveTrappedBy;
	private int trappedTurnsRemaining;
	private Nature nature;
	private boolean fainted = false;
	private boolean Flinched = false;
	private double ConditionSpeedMultiplier = 1;
	private double ConditionAttackMultiplier = 1;
	private boolean semiProtected = false;
	private String typeOfProtection = "";
	
	public SeenPokemon(int _level, Poke _Rep, Item _item)
	{
		level = _level;
		for(int i = 0; i < 5; i++)
			IV[i] = (int)(Math.random() * 32);
		pokemon = _Rep;
		Base[0] = pokemon.getBaseHP();
		Base[1] = pokemon.getBaseAttack();
		Base[2] = pokemon.getBaseDefense();
		Base[3] = pokemon.getBaseSpAttack();
		Base[4] = pokemon.getBaseSpDefense();
		Base[5] = pokemon.getBaseSpeed();
		accuracy = 1;
		evasiveness = 1;
		//MultipliersIndex = new int[]{6,6,6,6,6,6,6};
		setStats();
		HP = MaxHP;
		nature = PokemonGame.NatureDirectory.get(genrand(0,24));		
	}
	
	public SeenPokemon()
	{
		
	}
	
	private void setStats()
	{
		MaxHP = (int)(((IV[0] + Base[0] + Math.sqrt(EV[0]) / 8 + 50) * level) / 50 + 10);
		attack = (int)((((IV[1] + Base[1] + Math.sqrt(EV[1]) / 8) * level) / 50 + 5));// * (nature.getIncreaseStat() == 1 && nature.getDecreaseStat() == 1? 1:((nature.getIncreaseStat() == 1? 1.1: 1.0) * (nature.getDecreaseStat() == 1? .9 : 1))));
		defense = (int)((((IV[2] + Base[2] + Math.sqrt(EV[2]) / 8) * level) / 50 + 5));// * (nature.getIncreaseStat() == 2 && nature.getDecreaseStat() == 2? 1:((nature.getIncreaseStat() == 2? 1.1: 1.0) * (nature.getDecreaseStat() == 2? .9 : 1))));
		spAttack = (int)((((IV[3] + Base[3] + Math.sqrt(EV[3]) / 8) * level) / 50 + 5));// * (nature.getIncreaseStat() == 3 && nature.getDecreaseStat() == 3? 1:((nature.getIncreaseStat() == 3? 1.1: 1.0) * (nature.getDecreaseStat() == 3? .9 : 1))));
		spDefense = (int)((((IV[4] + Base[4] + Math.sqrt(EV[4]) / 8) * level) / 50 + 5));// * (nature.getIncreaseStat() == 4 && nature.getDecreaseStat() == 4? 1:((nature.getIncreaseStat() == 4? 1.1: 1.0) * (nature.getDecreaseStat() == 4? .9 : 1))));
		speed = (int)((((IV[5] + Base[5] + Math.sqrt(EV[5]) / 8) * level) / 50 + 5));// * (nature.getIncreaseStat() == 5 && nature.getDecreaseStat() == 5? 1:((nature.getIncreaseStat() == 5? 1.1: 1.0) * (nature.getDecreaseStat() == 5? .9 : 1))));
		
	}
	
	public void levelUp()
	{
		level++;
		setStats();
		canLearnMove();
	}
	
	public void resetMultipliers()
	{
		for(int x: MultipliersIndex)
		{
			x = 6;
		}
		criticalHitChance = 0;
	}
	
	public Move getMove(int move)
	{
		return moves.get(move);
	}
	
	public int getLastDamageTaken()
	{
		return lastDamageTaken;
	}
	
	public int getLastMoveUsed()
	{
		return lastMoveUsed;
	}
	
	public void setLastMoveUsed(int lastMove)
	{
		lastMoveUsed = lastMove;
	}
	
	public Poke getPoke()
	{
		return pokemon;
	}
	
	public ArrayList<Move> getMoves()
	{
		return moves;
	}
	
	public int Attack(SeenPokemon defender, int moveSlot)
	{
		Move move = new Move();
		double Damage = 0;
		//switch(moveSlot)
		//{
		//	case 1: move = move1;
		//			break;
		//	case 2: move = move2;
		//			break;
		//	case 3: move = move3;
		//			break;
		//	case 4: move = move4;
		//}
		move = moves.get(moveSlot);
		Damage = move.Attack(this, defender);
		moves.get(moveSlot).setCurrentTurnCompletion(moves.get(moveSlot).getCurrentTurnCompletion() - 1);
		System.out.println(moves.get(moveSlot).getCurrentTurnCompletion());
		/*if(!(move.attackType == 2))
		{
			Random r = new Random();
			int randMax = 100;
			int randMin = 85;
			int randNum = r.nextInt((randMax - randMin) + 1) + randMin;
			//Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) / 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
			int AttackStat = (int)(move.attackType == 0? this.getAttack() * this.getAttackMultiplier() : this.getSpAttack() * this.getSpecialAttackMultiplier());
			int DefenseStat = (int)(move.attackType == 0? defender.getDefense() * defender.getDefenseMultiplier(): defender.getSpDefense() * defender.getSpecialDefenseMultiplier());
			double STAB = (this.getType().get(0).equals(move.typeOfMove.getID())? 1.5 : (this.getType().get(1).equals(move.typeOfMove.getID()))? 1.5 : 1);
			double DamageMultiplier = move.typeOfMove.getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));
			Damage = ((((2 * this.getLevel() / 5 + 2) * AttackStat * move.power / DefenseStat) / 50) + 2) * STAB * DamageMultiplier * randNum / 100;
			defender.setHP(defender.getCurrentHP() - (int)Damage);
		}*/
		//move.secondaryEffect(this, defender, (int)Damage);
		defender.setHP(defender.getCurrentHP() - (int)Damage);
		System.out.println(Damage);
		return (int)Damage;
	}
	
	public void teachMove(Move moves)
	{
		//if(move1 == null)
		//	move1 = moves;
		//else if(move2 == null)
		//	move2 = moves;
		//else if(move3 == null)
		//	move3 = moves;
		//else if(move4 == null)
		//	move4 = moves;
		//else	; //Make a method to ask user things
		this.moves.add(moves);
	}

	public int getLevel()
	{
		return level;
	}
	
	public int getMaxHP()
	{
		return MaxHP;
	}
	
	public int getCurrentHP()
	{
		return HP;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getDefense()
	{
		return defense;
	}
	
	public int getSpAttack()
	{
		return spAttack;
	}
	
	public int getSpDefense()
	{
		return spDefense;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public boolean raiseAttackMultiplier()
	{
		if(MultipliersIndex[0] != 12)
			MultipliersIndex[0]++;
		else
			return false;
		return true;
	}
	
	public boolean raiseDefenseMultiplier()
	{
		if(MultipliersIndex[1] != 12)
			MultipliersIndex[1]++;
		else
			return false;
		return true;
	}
	
	public boolean raiseSpecialAttackMultiplier()
	{
		if(MultipliersIndex[2] != 12)
			MultipliersIndex[2]++;
		else
			return false;
		return true;
	}
	
	public boolean raiseSpecialDefenseMultiplier()
	{
		if(MultipliersIndex[3] != 12)
			MultipliersIndex[3]++;
		else
			return false;
		return true;
	}
	
	public boolean raiseSpeedMultiplier()
	{
		if(MultipliersIndex[4] != 12)
			MultipliersIndex[4]++;
		else
			return false;
		return true;
	}
	
	public boolean raiseEvasiveMultiplier()
	{
		if(MultipliersIndex[5] != 0)
			MultipliersIndex[5]--;
		else
			return false;
		return true;
	}
	
	public boolean raiseAccuracyMultiplier()
	{
		if(MultipliersIndex[6] != 12)
			MultipliersIndex[6]++;
		else
			return false;
		return true;
	}
	
	public boolean lowerAttackMultiplier()
	{
		if(MultipliersIndex[0] != 0)
			MultipliersIndex[0]--;
		else
			return false;
		return true;	
	}
	
	public boolean lowerDefenseMultiplier()
	{
		if(MultipliersIndex[1] != 0)
			MultipliersIndex[1]--;
		else
			return false;
		return true;
	}
	
	public boolean lowerSpecialAttackMultiplier()
	{
		if(MultipliersIndex[2] != 0)
			MultipliersIndex[2]--;
		else
			return false;
		return true;
	}
	
	public boolean lowerSpecialDefenseMultiplier()
	{
		if(MultipliersIndex[3] != 0)
			MultipliersIndex[3]--;
		else
			return false;
		return true;
	}
	
	public boolean lowerSpeedMultiplier()
	{
		if(MultipliersIndex[4] != 0)
			MultipliersIndex[4]--;
		else
			return false;
		return true;
	}
	
	public boolean lowerEvasiveMultiplier()
	{
		if(MultipliersIndex[5] != 12)
			MultipliersIndex[5]++;
		else
			return false;
		return true;
	}
	
	public boolean lowerAccuracyMultiplier()
	{
		if(MultipliersIndex[6] != 0)
			MultipliersIndex[6]--;
		else
			return false;
		return true;
	}
	
	public double getAttackMultiplier()
	{
		return MainMultipliers[MultipliersIndex[0]] * ConditionAttackMultiplier;
	}
	
	public double getDefenseMultiplier()
	{
		return MainMultipliers[MultipliersIndex[1]];
	}
	
	public double getSpecialAttackMultiplier()
	{
		return MainMultipliers[MultipliersIndex[2]];
	}
	
	public double getSpecialDefenseMultiplier()
	{
		return MainMultipliers[MultipliersIndex[3]];
	}
	
	public double getSpeedMultiplier()
	{
		return MainMultipliers[MultipliersIndex[4]] * ConditionSpeedMultiplier;
	}
	
	public double getEvasiveMultiplier()
	{
		return AccuracyMultipliers[MultipliersIndex[5]];
	}
	
	public double getAccuracyMultiplier()
	{
		return AccuracyMultipliers[MultipliersIndex[6]];
	}
	
	public ArrayList<PokeType> getType()
	{
		ArrayList<PokeType> pokemonType = new ArrayList<PokeType>();
		pokemonType.add(this.pokemon.getType1());
		try
		{
			pokemonType.add(this.pokemon.getType2());
		}
		catch(NullPointerException e)
		{
			//pokemonType.add(null);
		}
		return pokemonType;
	}
	
	public void PrintMoves()
	{
		int i = 0;
		for(Move m: moves)
		{
			System.out.print(i + ". ");
			System.out.println(m);
			i++;
		}
	}
	
	public void setHP(int HP)
	{
		this.HP = HP;
	}
	
	public void setCriticalHitChance(int chance)
	{
		criticalHitChance += chance;
	}
	
	public double getCriticalHitChanceMultiplier(int chanceModifier)
	{
		if(criticalHitChance > 4)
			criticalHitChance = 4;
		if(criticalHitChance + chanceModifier > 4)
			return CriticalHitMultiplier[4];
		else
			return CriticalHitMultiplier[criticalHitChance + chanceModifier];
	}
	
	public void setLastDamageTaken(int damageTaken)
	{
		lastDamageTaken = damageTaken;
	}
	
	public void canLearnMove()
	{
		if(pokemon.DoesLearnMove(level))
		{	
			teachMove(pokemon.getLearnMove(level));
		}
	}
	
	public boolean isTrapped()
	{
		return trapped;
	}
	
	public int getTurnsTrapped()
	{
		return trappedTurnsRemaining; 
	}
	
	public void enactTrapped()
	{
		Bind Bind = new Bind();
		Clamp Clamp = new Clamp();
		FireSpin fSpin = new FireSpin();
		switch(moveTrappedBy)
		{
		case "Bind": Bind.tertiaryEffect(this);
					 break;
		case "Clamp": Clamp.tertiaryEffect(this);
					  break;
		case "Fire Spin": fSpin.tertiaryEffect(this);
						  break;
		}
	}
	
	public void setTurnsTrapped(int turns)
	{
		trappedTurnsRemaining = turns;
	}
	
	public void setFreed()
	{
		trapped = false;
		moveTrappedBy = "";
		trappedTurnsRemaining = 0; 
	}
	
	public void setTrapped(String TrappingMove, int turnsTrapped)
	{
		trapped = true;
		moveTrappedBy = TrappingMove;
		trappedTurnsRemaining = turnsTrapped;
	}
	
	public String getCondition()
	{
		switch(condition)
		{
			case 0: return "No Condition";
			case 1: return "Asleep";
			case 2: return "Poisoned";
			case 3: return "Badly Poisoned";
			case 4: return "Paralyzed";
			case 5: return "Burned";
			case 6: return "Frozen";
			case 7: return "Confused";
			case 8: return "Leeched";
		}
		return "";
	}
	
	public void setCondition(int con)
	{
		boolean canHaveCondition = true;
		if(condition != 0)
		{
			canHaveCondition = false;
		}
		if(con == 2 || con == 3)
		{
			if(this.getType().get(0).getID().equals("Poison") || this.getType().get(0).getID().equals("Steel"))
				canHaveCondition = false;
			else
			{
				try
				{
					if(this.getType().get(1).getID().equals("Poison") || this.getType().get(1).getID().equals("Steel"))
					{
						canHaveCondition = false;
					}
				}catch(NullPointerException e){}

			}
		}
		if(con == 4)
		{
			if(this.getType().get(0).getID().equals("Electric"))
				canHaveCondition = false;
			else
			{	
				try
				{
					if(this.getType().get(1).getID().equals("Electric"))
						canHaveCondition = false;
				}catch(NullPointerException e){}

			}
		}
		if(con == 5)
		{
			if(this.getType().get(0).getID().equals("Fire"))
				canHaveCondition = false;
			else
			{	
				try
				{
					if(this.getType().get(1).getID().equals("Fire"))
						canHaveCondition = false;
				}catch(NullPointerException e){}

			}
		}
		if(canHaveCondition == true)
		{
			condition = con;
			switch(condition)
			{
				case 1: System.out.println(this.pokemon.name + " fell Asleep!");
				        conditionDuration = genrand(2,5);
						break;
				case 2: System.out.println(this.pokemon.name + " was Poisoned!");
						break;
				case 3: System.out.println(this.pokemon.name + " was Badly Poisoned!");
						break;
				case 4: System.out.println(this.pokemon.name + " was Paralyzed!");
						System.out.println("It may be unable to move!");
						break;
				case 5: System.out.println(this.pokemon.name + " was Burned!");
						break;
				case 6: System.out.println(this.pokemon.name + " was Frozen!");
			}
		}
		else
		{
			System.out.println("The move failed!");
		}
		if(condition == 4)
		{
			ConditionSpeedMultiplier = .5;
		}
		if(condition == 5)
		{
			ConditionAttackMultiplier = .5;
		}
	}
	
	public boolean hasCondition()
	{
		return (condition != 0);
	}
	
	public boolean enactCondition(boolean beginning)
	{
		if(hasCondition())
		{
			if(beginning)
			{
				switch(condition)
				{
					case 0: 
						return true;
					case 1: 
						return Sleep();
					case 4: 
						return Paralysis();
					case 6: 
						return Frozen();
				//	case 7: 
					//	return Confusion();
					//case 8: seeded();
						//return true;
				}
			}
			else
			{
				switch(condition)
				{
					case 0: 
						return true;
					case 2: Poisoned();
						return true;
					case 3: BadlyPoisoned();
						return true;
					case 5: Burnt();
						return true;
				//	case 7: 
					//	return Confusion();
					//case 8: seeded();
						//return true;
				}
			}
		}
		return true;
	}
	
	public boolean Sleep()
	{	
		if(conditionDuration == 0)
		{
			System.out.println(pokemon.name + " woke up!");
			condition = 0;
			return true;
		}
		System.out.println(pokemon.name + " is asleep.");
		conditionDuration--;
		return false;
	}
	
	public void Poisoned()
	{
		HP -= MaxHP / 8;
		System.out.println(pokemon.name + " lost some HP from its poison.");
	}
	
	public void BadlyPoisoned()
	{
		conditionDuration++;
		HP -= MaxHP * conditionDuration / 16;
		System.out.println(pokemon.name + " lost some HP from its poison.");
	}
	
	public boolean Paralysis()
	{
		ConditionSpeedMultiplier = .5;
		if((int)(Math.random() * 4)  == 0)
		{
			System.out.println(pokemon.name + " is fully paralyzed.");
			return false;
		}
		return true;
	}
	
	public void seeded()
	{
		HP -= MaxHP / 8;
		System.out.println(pokemon.name + " lost some HP.");
	}
	
	public boolean Confusion()
	{
		
		return false;
	}
	
	
	public boolean Frozen()
	{
		if((int)(Math.random() * 5) == 0)
		{
			System.out.println(pokemon.name + " thawed out!");
			condition = 0;
			return true;
		}
		return false;
	}
	
	public void Burnt() //add fireproof ability
	{
		HP -= MaxHP / 8;
		System.out.println(pokemon.name + " is hurt by its burn.");
		ConditionAttackMultiplier = .5;
	}
	
	public boolean isAlive()
	{
		if(HP <= 0)
			setDead();
		else 
			fainted = false;
		return !fainted;
	}
	
	private void setDead()
	{
		fainted = true;
		condition = 0;
		conditionDuration = 0;
		setFreed();
		Flinched = false;
		HP = 0;
		resetMultipliers();
	}
	
	public boolean getFlinched()
	{
		return Flinched;
	}
	
	public void setFlinched(boolean flinch)
	{
		Flinched = flinch;
	}
	
	public static int genrand(int min, int max)
	{
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public String toString()
	{
		String obj = "";
		obj = pokemon.name + " (" + pokemon.type1.getID();
		if(pokemon.type2 != null)
			obj += "/" + pokemon.type2.getID() + ") ";
		else
			obj += ") ";
		if(!isAlive())
		{
			obj += "(fainted) ";
		}
		if(hasCondition())
		{
			obj += getCondition() + " ";
		}
		obj += "HP: " + HP + "/" + MaxHP;
		return obj;
	}
	
	public SeenPokemon setMoves(Move a, Move b, Move c, Move d)
	{
		moves.add(a);
		moves.add(a);
		moves.add(a);
		moves.add(a);
		moves.set(0, a);
		moves.set(1, b);
		moves.set(2, c);
		moves.set(3, d);
		return this;
	}
	
	public boolean isProtected()
	{
		return semiProtected;
	}
	
	public String typeOfProtection()
	{
		return typeOfProtection;
	}
	
	public void setProtected(String moveProtectedBy)
	{
		typeOfProtection = moveProtectedBy;
	}
	
	public void setNotProtected()
	{
		semiProtected = false;
		typeOfProtection = "";
	}
	
	private void refillMovePP()
	{
		for(int i = 0; i < moves.size();i++)
			moves.get(i).refillPP();
	}
	
	public void fullyHeal()
	{
		setStats();
		HP = MaxHP;
		refillMovePP();
		criticalHitChance = 0;
		condition = 0;
		conditionDuration = 0;
		ConditionAttackMultiplier = 1;
		ConditionSpeedMultiplier = 1;
	}


	
}