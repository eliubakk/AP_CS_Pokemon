package pokemon;

import java.util.Map;

import javafx.util.Pair;

public abstract class Pokemon 
{
	private static Map<String, Stats> pokeStatsDirectory = null;
	
	private Pokemon()
	{
		initPrivates();
	}
	
	private void initPrivates()
	{
		if (pokeStatsDirectory != null)
		{
			return;
		}
		
		/// TODO: Parse the "stats.csv" file
	}
	
	private class Stats
	{
		public Pair<PokeType, PokeType> types;
		public int hp;
		public int att;
		public int def;
		public int spa;
		public int spd;
		public int speed;
		public boolean legendary;
		
		Stats(String type1, String type2, int hp, int att, int def, int spa, int spd, int speed, boolean legendary) 
		{
			types = new Pair<PokeType, PokeType>(new PokeType(type1), new PokeType(type2));
			this.hp = hp;
			this.att = att;
			this.def = def;
			this.spa = spa;
			this.spd = spd;
			this.speed = speed;
			this.legendary = legendary;
		}
	}
}
