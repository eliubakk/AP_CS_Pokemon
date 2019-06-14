package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class HornAttack extends Move
{
	public HornAttack()
	{
		super("Horn Attack", PokemonGame.Normal, 0, 25, 65, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
