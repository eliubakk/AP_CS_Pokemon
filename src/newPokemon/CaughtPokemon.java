package newPokemon;

public class CaughtPokemon extends SeenPokemon
{
	private String name;
	// experience accrued for this level
	private int exp;
	
	public CaughtPokemon(SeenPokemon poke)
	{
		super(poke);
		name = getPokeSpecies();
		exp = 0;
	}
	
	public void changeName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getExperience()
	{
		return exp;
	}
	
	// returns whether or not a level was increased
	public boolean addExperience(int exp)
	{
		this.exp += exp;
		
		/// TODO: return true code.
		
		return false;
	}
}
