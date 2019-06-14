package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Psybeam extends Move
{
	public Psybeam()
	{
		super("Psybeam", PokemonGame.Psychic, 1, 20, 65, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance to confuse the target
	}
}
