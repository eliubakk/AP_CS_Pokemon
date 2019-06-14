package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Meditate extends Move
{
	public Meditate()
	{
		super("Meditate", PokemonGame.Psychic, 2, 40, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Increase the user's attack by one level
		if(Attacker.raiseAttackMultiplier())
		{
			System.out.println(Attacker.pokemon.name + "'s attack rose.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s attack can't go any higher.");
	}
}
