package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Roar extends Move
{
	public Roar()
	{
		super("Roar", PokemonGame.Normal, 2, 20, 0, 0, 1, -6);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Switches out the pokemon to a random pokemon in the trainers party.
	}
}
