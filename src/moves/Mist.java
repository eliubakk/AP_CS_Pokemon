package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Mist extends Move
{
	public Mist()
	{
		super("Mist", PokemonGame.Ice, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Prevents stat decreases for the team. lasts for 5 turns
	}
}
