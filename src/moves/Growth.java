package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Growth extends Move
{
	public Growth()
	{
		super("Growth", PokemonGame.Normal, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//increases Attack and Special Attack by on stage
		if(Attacker.raiseAttackMultiplier())
			System.out.println(Attacker.getPoke().name + "'s attack rose!");
		else
			System.out.println(Attacker.getPoke().name + "'s attack can't go any higher!");
		if(Attacker.raiseSpecialAttackMultiplier())
			System.out.println(Attacker.getPoke().name + "'s special attack rose!");
		else 
			System.out.println(Attacker.getPoke().name + "'s special attack can't go any higher!");
	}
}