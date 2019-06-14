package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class MirrorMove extends Move
{
	public MirrorMove()
	{
		super("Mirror Move", PokemonGame.Flying, 2, 20, 0, 0, 1, 0);
	}
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
			if(defender.getLastMoveUsed() != 5)
				return defender.getMove(defender.getLastMoveUsed()).Attack(attacker, defender);
			else
				System.out.println("The move failed!");
			return 0;
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Causes the user to use the last move that the target used.
	}
}
