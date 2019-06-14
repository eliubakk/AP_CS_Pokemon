package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class PetalDance extends Move
{
	public PetalDance()
	{
		super("Petal Dance", PokemonGame.Grass, 1, 10, 120, 100, 3, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//The user has to continue to use this move for 2 to 3 turns.  At the end of the turns, the user becomes confused.
		setCurrentTurnCompletion(getCurrentTurnCompletion() - 1);
	}
}
