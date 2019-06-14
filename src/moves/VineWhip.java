package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class VineWhip extends Move
{
	public VineWhip()
	{
		super("Vine Whip", PokemonGame.Grass, 0, 25, 45, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//no effect
	}
}
