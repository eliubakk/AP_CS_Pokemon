package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class AuroraBeam extends Move
{
	public AuroraBeam()
	{
		super("Aurora Beam", PokemonGame.Ice, 1, 20, 65, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance of lowering the targets Attack
		int chance = genrand(1, 100);
		if(chance <= 10)
		{
			if(Defender.lowerAttackMultiplier())
				System.out.println(Defender.pokemon.name + "'s Attack was lowered.");
			else 
				System.out.println(Defender.pokemon.name + "'s Attack can't be lowered anymore.");
		}
	}
}
