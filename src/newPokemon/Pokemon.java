package newPokemon;

import java.util.Map;

import javafx.util.Pair;

import static newPokemon.PokeType.fromStr;

public abstract class Pokemon 
{
	public final static String Bulbasaur = "Bulbasaur";
	public final static String Ivysaur = "Ivysaur";
	public final static String Venusaur = "Venusaur";
	public final static String Charmander = "Charmander";
	
	
	public final static String NidroranM = "Nidoran♂";
	
	private static Map<String, Stats> pokeStatsDirectory = null;
	
	private String pokeSpecies;
	
	protected Pokemon(String pokeName)
	{
		initPrivates();
		
		pokeSpecies = pokeName;
	}
	
	private void initPrivates()
	{
		if (pokeStatsDirectory != null)
		{
			return;
		}
		
		/// TODO: Parse the "stats.csv" file to populate pokeStatsDirectory
	}
	
	public String getPokeSpecies()
	{
		return pokeSpecies;
	}
	
	protected int getHPStat()
	{
		return pokeStatsDirectory.get(pokeSpecies).hp;
	}
	
	protected int getAttStat()
	{
		return pokeStatsDirectory.get(pokeSpecies).att;
	}
	
	protected int getDefStat()
	{
		return pokeStatsDirectory.get(pokeSpecies).def;
	}
	
	protected int getSpAStat()
	{
		return pokeStatsDirectory.get(pokeSpecies).spa;
	}
	
	protected int getSpDStat()
	{
		return pokeStatsDirectory.get(pokeSpecies).spd;
	}
	
	protected int getSpeedStat()
	{
		return pokeStatsDirectory.get(pokeSpecies).speed;
	}
	
	public Pair<PokeType, PokeType> getTypes()
	{
		return new Pair<PokeType, PokeType>(pokeStatsDirectory.get(pokeSpecies).type1, 
											pokeStatsDirectory.get(pokeSpecies).type2);
	}
	
	protected class Stats
	{
		public PokeType type1;
		public PokeType type2;
		public int hp;
		public int att;
		public int def;
		public int spa;
		public int spd;
		public int speed;
		
		Stats(String type1, String type2, int hp, int att, int def, int spa, int spd, int speed) 
		{
			this.type1 = fromStr(type1);
			this.type2 = fromStr(type2);
			this.hp = hp;
			this.att = att;
			this.def = def;
			this.spa = spa;
			this.spd = spd;
			this.speed = speed;
		}
	}
}
