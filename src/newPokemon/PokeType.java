package newPokemon;

public enum PokeType
{
	Bug,
	Dark,
	Dragon,
	Electric,
	Fairy,
	Fighting,
	Fire,
	Flying,
	Ghost,
	Grass,
	Ground,
	Ice,
	Normal,
	Poison,
	Psychic,
	Rock,
	Steel,
	Water;
	
	public static PokeType fromStr(String s)
	{
		try {
			return PokeType.valueOf(s);
		} catch (IllegalArgumentException e)
		{
			return null;
		}
	}
}
