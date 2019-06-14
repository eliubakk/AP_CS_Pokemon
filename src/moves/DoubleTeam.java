package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class DoubleTeam extends Move
{
	public DoubleTeam()
	{
		super("Double Team", PokemonGame.Normal, 2, 15, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Raises the users evasiveness
		if(Attacker.raiseEvasiveMultiplier())
			System.out.println(Attacker.getPoke().name + "'s evasiveness rose!");
		else
			System.out.println(Attacker.getPoke().name + "'s can't go any higher!");
	}
}
