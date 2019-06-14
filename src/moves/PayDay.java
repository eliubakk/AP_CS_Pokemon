package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class PayDay extends Move
{
	public PayDay()
	{
		super("Pay Day", PokemonGame.Normal, 0, 20, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//scatters coins equal to five times the user's level each time.
	{
		
	}
}
