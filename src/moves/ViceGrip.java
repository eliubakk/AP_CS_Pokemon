package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class ViceGrip extends Move
{
	public ViceGrip()
	{
		super("Vice Grip", PokemonGame.Normal, 0, 30, 55, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//no secondary effect.
	{
		
	}
}
