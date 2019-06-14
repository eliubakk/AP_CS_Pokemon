package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class SelfDestruct extends Move
{
	public SelfDestruct()
	{
		super("Self-Destruct", PokemonGame.Normal, 0, 5, 200, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//causes the user to faint.
		Attacker.setHP(0);
	}
}
