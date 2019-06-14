package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class WaterGun extends Move
{
	public WaterGun()
	{
		super("Water Gun", PokemonGame.Water, 1, 25, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
