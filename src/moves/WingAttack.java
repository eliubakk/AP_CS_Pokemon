package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class WingAttack extends Move
{
	public WingAttack()
	{
		super("Wing Attack", PokemonGame.Flying, 0, 35, 60, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
