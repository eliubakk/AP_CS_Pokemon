package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Cut extends Move
{
	public Cut()
	{
		super("Cut", PokemonGame.Normal, 0, 30, 50, 95, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//No effect.
	{
		
	}
}
