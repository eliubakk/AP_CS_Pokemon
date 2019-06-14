package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class MegaPunch extends Move
{
	public MegaPunch()
	{
		super("Mega Punch", PokemonGame.Normal, 0, 20, 80, 85, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//no secondary effect.
	{
		
	}
}
