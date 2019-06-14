package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Transform extends Move
{
	public Transform()
	{
		super("Transform", PokemonGame.Normal, 2, 10, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//transforms the users current type, stats, stat modifications, moves, and species of the target.  Each move copied will have 5pp.  
	}
}
