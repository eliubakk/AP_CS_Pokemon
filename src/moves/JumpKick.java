package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class JumpKick extends Move
{
	public JumpKick()
	{
		super("Jump Kick", PokemonGame.Fighting, 0, 10, 100, 95, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//If attack misses, user takes 1/8 HP of damage.
	}
}
