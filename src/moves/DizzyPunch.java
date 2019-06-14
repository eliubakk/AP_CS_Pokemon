package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class DizzyPunch extends Move
{
	public DizzyPunch()
	{
		super("Dizzy Punch", PokemonGame.Normal, 0, 10, 70, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance to confuse the target.
	}
}
