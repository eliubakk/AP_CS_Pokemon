package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Scratch extends Move
{
	public Scratch()
	{
		super("Scratch", PokemonGame.Normal, 0, 35, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//No effect.
	{
		
	}
}
