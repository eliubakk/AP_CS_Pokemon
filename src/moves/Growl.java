package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Growl extends Move
{
	public Growl()
	{
		super("Growl", PokemonGame.Normal, 2, 40, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Decreases Attack by one stage
		if(Defender.lowerAttackMultiplier())
			System.out.println(Defender.pokemon.name + "'s attack was lowered.");
		else 
			System.out.println(Defender.pokemon.name + "'s attack can't be lowered anymore.");
	}
}
