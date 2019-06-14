package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class MegaKick extends Move
{
	public MegaKick()
	{
		super("Mega Kick", PokemonGame.Normal, 0, 5, 120, 75, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
