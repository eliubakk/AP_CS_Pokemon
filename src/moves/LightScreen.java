package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class LightScreen extends Move
{
	public LightScreen()
	{
		super("Light Screen", PokemonGame.Psychic, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//reduces the damage from special attacks by 50% for 5 turns
	}
}
