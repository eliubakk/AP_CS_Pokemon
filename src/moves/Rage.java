package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Rage extends Move
{
	public Rage()
	{
		super("Rage", PokemonGame.Normal, 0, 20, 20, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Look online for secondary effect. 
	}
}
