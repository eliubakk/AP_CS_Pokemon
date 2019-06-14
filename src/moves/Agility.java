package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Agility extends Move
{
	public Agility()
	{
		super("Agility", PokemonGame.Psychic, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Increases the user's speed by two levels
		if(Attacker.raiseSpeedMultiplier())
		{
			if(Attacker.raiseSpeedMultiplier())
				System.out.println(Attacker.pokemon.name + "'s speed rose sharply.");
			else
				System.out.println(Attacker.pokemon.name + "'s speed can't go any higher.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s speed can't go any higher.");
	}
}
