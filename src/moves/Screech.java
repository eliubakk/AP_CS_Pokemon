package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Screech extends Move
{
	public Screech()
	{
		super("Screech", PokemonGame.Normal, 2, 40, 0, 85, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Lowers the targets defense by two stages.
		if(Defender.raiseDefenseMultiplier())
		{
			if(Defender.raiseDefenseMultiplier())
				System.out.println(Defender.pokemon.name + "'s defense rose sharply.");
			else
				System.out.println(Defender.pokemon.name + "'s defense can't go any higher.");
		}
		else 
			System.out.println(Defender.pokemon.name + "'s defense can't go any higher.");
	}
}
