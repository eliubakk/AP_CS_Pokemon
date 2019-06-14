package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Thrash extends Move
{
	public Thrash()
	{
		super("Thrash", PokemonGame.Normal, 0, 10, 120, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//2-3 turns, User becomes confused after final use.  Is trapped while being used.
		setCurrentTurnCompletion(getCurrentTurnCompletion() - 1);
	}
}
