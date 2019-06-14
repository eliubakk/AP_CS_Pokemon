package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Teleport extends Move
{
	public Teleport()
	{
		super("Teleport", PokemonGame.Psychic, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//The pokemon flees if it is a wild battle
	}
}
