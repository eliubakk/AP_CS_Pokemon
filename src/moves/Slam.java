package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Slam extends Move
{
	public Slam()
	{
		super("Slam", PokemonGame.Normal, 0, 20, 80, 75, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
