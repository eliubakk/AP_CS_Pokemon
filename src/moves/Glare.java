package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Glare extends Move
{
	public Glare()
	{
		super("Glare", PokemonGame.Normal, 2, 30, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Paralyze's the target.
		Defender.setCondition(4);
	}
}
