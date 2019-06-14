package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Pound extends Move
{
	public Pound()
	{
		super("Pound", PokemonGame.Normal, 0, 35, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//no secondary effect.
	{
		
	}
}
