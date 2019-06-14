package pokemon;

import items.Item;

public class CaughtPokemon extends SeenPokemon
{
	//int currentExperience;
	int totalExperience;
	public CaughtPokemon(int _level, Poke _Rep, Item _item) 
	{
		super(_level, _Rep, _item);
	}
	public void leveling()
	{
		int level = super.getLevel();
		switch(pokemon.levelingRate)
		{
			case 0:
				
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
		}
	}
	public void gainExperience()
	{
		
	}

}
