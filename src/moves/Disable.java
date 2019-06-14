package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Disable extends Move
{
	public Disable()
	{
		super("Disable", PokemonGame.Normal, 2, 20, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Disables the last move the target used for four turns
	}
}
