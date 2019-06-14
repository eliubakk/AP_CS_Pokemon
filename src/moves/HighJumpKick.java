package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class HighJumpKick extends Move
{
	public HighJumpKick()
	{
		super("High Jump Kick", PokemonGame.Fighting, 0, 10, 130, 90, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//If the move misses, half the users maxHP is given as crash damage
		
	}
}
