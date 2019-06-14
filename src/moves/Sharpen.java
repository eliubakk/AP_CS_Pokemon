package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Sharpen extends Move
{
	public Sharpen()
	{
		super("Sharpen", PokemonGame.Normal, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Increases the user's attack stat
		if(Attacker.raiseAttackMultiplier())
		{
			System.out.println(Attacker.pokemon.name + "'s attack rose.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s attack can't go any higher.");
	}
}
