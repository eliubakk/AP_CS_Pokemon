package pokemon;

import moves.Move;
import red.PokemonGame;

public class Poke //interface species
{
	private int[] EVYield = new int[6]; //hp, attack, defense, sp atk, sp def, speed
	public PokeType type1;
	public PokeType type2;
	public int pokeIndex;
	public boolean seen = false;
	private int[] BaseStats;
	public String Pokedex;
	public int ColumnNum;
	public int RowNum;
	public int levelingRate; //0-Erratic, 1-Fast, 2-Medium Fast, 3-Medium Slow, 4-Slow, 5-Fluctuating
	private Move[] learnableMoves;
	private int[][] moveLevel;
	public String name;
	public boolean canEvolve = false;
	public boolean multipleEvolutions = false;
	public int EvolvesInto;
	public int EvolveLevel;
	
	
	public Poke(String _name, int _pokeIndex, PokeType _type1, PokeType _type2, int HP, int attack, int defense, int spattack, int spdefense, int speed)
	{
		name = _name;
		type1 = _type1;
		type2 = _type2;
		BaseStats = new int[]{HP, attack, defense, spattack, spdefense, speed};
		pokeIndex = _pokeIndex;
		ColumnNum = pokeIndex % 16;
		RowNum = pokeIndex / 16;
		//EVYield[EVYieldStat] = _EVYield;
	}
	
	public PokeType getType1()
	{
		return type1;
	}
	
	public PokeType getType2()
	{
		return type2;
	}
	
	public int getBaseHP()
	{
		return BaseStats[0];
	}
	
	public int getBaseAttack()
	{
		return BaseStats[1];
	}
	
	public int getBaseDefense()
	{
		return BaseStats[2];
	}
	
	public int getBaseSpAttack()
	{
		return BaseStats[3];
	}
	
	public int getBaseSpDefense()
	{
		return BaseStats[4];
	}
	
	public int getBaseSpeed()
	{
		return BaseStats[5];
	}
	
	public void setSeen()
	{
		seen = true;
	}
	
	public Move[] getLearnableMoves()
	{
		return learnableMoves;
	}
	public void setLearnableMoves(Move[] Moves)
	{
		learnableMoves = Moves;
	}
	
	public boolean DoesLearnMove(int level) 
	{
		for(int x: moveLevel[0])
			if(x == level)
				return true; 
		return false;
	}
	
	public Move getLearnMove(int level)
	{
		for(int i = 0; i < moveLevel.length;i++) 
			if(moveLevel[0][i] == level)
				return learnableMoves[i];
		return null;
	}

	public int[] getEVYield()
	{
		return EVYield;
	}

	public void setEVYield(int[] eVYield)
	{
		EVYield = eVYield;
	}
	
	public void setMoveLevel(int[][] _moveLevel)
	{
		moveLevel = _moveLevel;
	}
	
	public int[][] getMoveLevel()
	{
		return moveLevel;
	}
	public void evolveSetter(int lvl, int pokeNumber)
	{
		EvolvesInto = pokeNumber;
		EvolveLevel = lvl;
	}
}
