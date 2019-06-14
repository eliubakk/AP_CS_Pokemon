package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Whirlwind extends Move
{
	public Whirlwind()
	{
		super("Whirlwind", PokemonGame.Normal, 2, 20, 0, 0, 1, -6);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Ends battle. Switches the opponent Pok�mon in a trainer battle.
	}
}
