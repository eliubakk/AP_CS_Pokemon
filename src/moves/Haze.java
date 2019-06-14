package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Haze extends Move
{
	public Haze()
	{
		super("Haze", PokemonGame.Ice, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Resets all stats of both pokemon to 0
		Attacker.resetMultipliers();
		Defender.resetMultipliers();
		System.out.println("All stat changes were reset!");
	}
}
