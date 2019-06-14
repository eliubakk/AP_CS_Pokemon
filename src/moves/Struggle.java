package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Struggle extends Move
{
	public Struggle()
	{
		super("Struggle", PokemonGame.Normal, 0, 1, 50, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Uneffected by accuracy and evasion stats, the user takes 1/4 of its maximum HP as recoil.  is considered a typeless move.  PP will never be reducted.
	}
}
