package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Minimize extends Move
{
	public Minimize()
	{
		super("Minimize", PokemonGame.Normal, 2, 10, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//raises the users evasion stat
		if(Attacker.raiseEvasiveMultiplier())
			System.out.println(Attacker.getPoke().name + "'s evasiveness rose!");
		else
			System.out.println(Attacker.getPoke().name + "'s can't go any higher!");
	}
}
