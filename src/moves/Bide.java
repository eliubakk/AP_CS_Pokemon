package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Bide extends Move
{
	public Bide()
	{
		super("Bide", PokemonGame.Normal, 0, 10, 0, 100, 3, 1);
	}
	
	int totalDamage = 0;
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
		if(!attacker.getFlinched())
		{
			secondaryEffect(attacker, defender, 0);
			if(getCurrentTurnCompletion() > 1)
				return 0;
			else
			{
				System.out.println(attacker.getPoke().name + " unleashed energy!");
				if(!defender.isProtected())
				{
					lowerCurrentPP();
					return totalDamage * 2;
				}
				else
				{
					System.out.println(defender.getPoke().name + " avoided the move!");
					lowerCurrentPP();
					return 0;
				}
			}
		}
		else
		{
			System.out.println(attacker.getPoke().name + " flinched!");
			lowerCurrentPP();
			setCurrentTurnCompletion(1);
			return 0;
		}
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Stores engergy for 2 turns. at the end of the second turn, it unleashes energy dealing twice the HP damage it received.
		totalDamage += Attacker.getLastDamageTaken();
		System.out.println(Attacker.getPoke().name + " is storing energy!");
	}
}
