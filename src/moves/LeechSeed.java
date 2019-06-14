package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class LeechSeed extends Move
{
	public LeechSeed()
	{
		super("Leech Seed", PokemonGame.Grass, 2, 10, 0, 90, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Seed's the target.  1/8 of maximum hp is taken
	}
}
