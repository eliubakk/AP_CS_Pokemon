package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class RockThrow extends Move
{
	public RockThrow()
	{
		super("Rock Throw", PokemonGame.Rock, 0, 15, 50, 90, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
