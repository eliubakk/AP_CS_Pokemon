package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class PoisonGas extends Move
{
	public PoisonGas()
	{
		super("Poison Gas", PokemonGame.Poison, 2, 40, 0, 90, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//poisons that target.
		Defender.setCondition(2);
	}
}
