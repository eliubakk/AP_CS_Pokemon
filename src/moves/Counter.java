package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Counter extends Move
{
	public Counter()
	{
		super("Counter", PokemonGame.Fighting, 0, 20, 0, 100, 1, -5);
	}
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
		if(!defender.isProtected() && !attacker.getFlinched())
		{
			if(defender.getLastMoveUsed() != 5)
			{
				if(defender.getMove(defender.getLastMoveUsed()).getAttackType() == 0)
				{
					lowerCurrentPP();
					return defender.getLastDamageTaken() * 2;
				}
				else
				{
					System.out.println("The move failed!");
				}
			}
			else
				System.out.println("The move failed!");
		}
		else if(defender.isProtected())
		{
			System.out.println("The move failed!");
		}
		else
		{
			System.out.println(attacker.getPoke().name + " flinched!");
		}
		lowerCurrentPP();
		return 0;
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//counters all physical moves for twice damage.
		
	}
}
