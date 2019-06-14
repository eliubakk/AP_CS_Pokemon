package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Confusion extends Move
{
	public Confusion()
	{
		super("Confusion", PokemonGame.Psychic, 2, 25, 50, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance of confusing the target
	}
}
