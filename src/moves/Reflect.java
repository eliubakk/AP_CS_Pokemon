package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Reflect extends Move
{
	public Reflect()
	{
		super("Reflect", PokemonGame.Psychic, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//reduces damage from physical attacks by 50% for 5 turns.
	}
}
