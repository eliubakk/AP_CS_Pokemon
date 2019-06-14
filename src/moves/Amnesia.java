package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Amnesia extends Move
{
	public Amnesia()
	{
		super("Amnesia", PokemonGame.Psychic, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Raises the users special defense two stages
		if(Attacker.raiseSpecialDefenseMultiplier())
		{
			if(Attacker.raiseSpecialDefenseMultiplier())
				System.out.println(Attacker.pokemon.name + "'s special defense rose sharply.");
			else
				System.out.println(Attacker.pokemon.name + "'s special defense can't go any higher.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s special defense can't go any higher.");
	}
}
