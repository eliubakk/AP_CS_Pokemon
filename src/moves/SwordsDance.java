package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class SwordsDance extends Move
{
	public SwordsDance()
	{
		super("Swords Dance", PokemonGame.Normal, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//increases the user's Attack stat by two stages.
	{
		if(Attacker.raiseAttackMultiplier())
		{
			if(Attacker.raiseAttackMultiplier())
				System.out.println(Attacker.pokemon.name + "'s attack rose sharply.");
			else
				System.out.println(Attacker.pokemon.name + "'s attack can't go any higher.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s attack can't go any higher.");
	}
}
