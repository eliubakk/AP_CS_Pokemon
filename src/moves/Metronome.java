package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Metronome extends Move
{
	public Metronome()
	{
		super("Metronome", PokemonGame.Normal, 2, 10, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//performs any move in the game at random
	}
}
