package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class DefenseCurl extends Move
{
	public DefenseCurl()
	{
		super("Defense Curl", PokemonGame.Normal, 2, 40, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//raises the users defense
		if(Attacker.raiseDefenseMultiplier())
		{
			System.out.println(Attacker.pokemon.name + "'s defense rose.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s defense can't go any higher.");
	}
}
