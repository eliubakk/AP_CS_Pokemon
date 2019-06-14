package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class DrillPeck extends Move
{
	public DrillPeck()
	{
		super("Drill Peck", PokemonGame.Flying, 0, 20, 80, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//No effect.
	{
		
	}
}
