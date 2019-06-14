package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Harden extends Move
{
	public Harden()
	{
		super("Harden", PokemonGame.Normal, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//increases the users defense stat
		if(Attacker.raiseDefenseMultiplier())
		{
			System.out.println(Attacker.pokemon.name + "'s defense rose.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s defense can't go any higher.");
	}
}
