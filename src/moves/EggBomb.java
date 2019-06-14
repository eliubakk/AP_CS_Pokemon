package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class EggBomb extends Move
{
	public EggBomb()
	{
		super("Egg Bomb", PokemonGame.Normal, 0, 10, 100, 75, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
