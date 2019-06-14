package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class TailWhip extends Move
{
	public TailWhip()
	{
		super("Tail Whip", PokemonGame.Normal, 2, 30, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Decreases defenders defense by one stage
		if(Defender.lowerDefenseMultiplier())
			System.out.println(Defender.getPoke().name + "'s defense was lowered!");
		else
			System.out.println(Defender.getPoke().name + "'s defense won't go any lower!");
	}
}
