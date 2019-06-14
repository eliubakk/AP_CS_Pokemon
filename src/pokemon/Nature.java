package pokemon;

public class Nature
{

	// 0-HP, 1-Atk, 2-Def, 3-Sp. Atk, 4- Sp. Def, 5-Speed
	private int increaseStat;
	private int decreaseStat;
	private String name;
	
	public Nature(int inc, int dec, String Name)
	{
		setIncreaseStat(inc);
		setDecreaseStat(dec);
		name = Name;
	}

	public int getIncreaseStat()
	{
		return increaseStat;
	}

	private void setIncreaseStat(int increaseStat)
	{
		this.increaseStat = increaseStat;
	}

	public int getDecreaseStat()
	{
		return decreaseStat;
	}

	private void setDecreaseStat(int decreaseStat)
	{
		this.decreaseStat = decreaseStat;
	}
	
	public String getName()
	{
		return name;
	}
	
}
