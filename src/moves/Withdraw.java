package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Withdraw extends Move
{
	public Withdraw()
	{
		super("Withdraw", PokemonGame.Water, 2, 40, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Raises the users defense by one stage
		if(Attacker.raiseDefenseMultiplier())
		{
			System.out.println(Attacker.pokemon.name + "'s defense rose.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s defense can't go any higher.");
	}
}
