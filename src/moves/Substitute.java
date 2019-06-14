package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Substitute extends Move
{
	public Substitute()
	{
		super("Substitute", PokemonGame.Normal, 2, 10, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//The user uses 25% of its max hp to create a sub that will absorb damage and block status moves until the amount of hp used to make the sub is dealt to the sub.
	}
}
