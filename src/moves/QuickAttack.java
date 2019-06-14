package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class QuickAttack extends Move
{
	public QuickAttack()
	{
		super("Quick Attack", PokemonGame.Normal, 0, 30, 40, 100, 1, 1);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
