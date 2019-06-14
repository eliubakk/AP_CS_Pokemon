package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Splash extends Move
{
	public Splash()
	{
		super("Splash", PokemonGame.Normal, 2, 40, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect
		System.out.println("But nothing happened!");
	}
}
