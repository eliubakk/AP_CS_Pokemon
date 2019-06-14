package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Bind extends Move
{
	public Bind()
	{
		super("Bind", PokemonGame.Normal, 0, 20, 15, 85, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Traps opponent. for 2-5 turns 
		if(!Defender.isTrapped())
		{	
			double chance = genrand(1,1000)/10.0;
			if(chance > 62.5)
			{
				Defender.setTrapped("Bind", 2);
			}
			else if(chance > 25.0)
			{
				Defender.setTrapped("Bind", 3);
			}
			else if(chance > 12.5)
			{
				Defender.setTrapped("Bind", 4);
			}
			else if(chance > 0.0)
			{
				Defender.setTrapped("Bind", 5);
			}
		}
	}
	public void tertiaryEffect(SeenPokemon Defender)
	{
		if(Defender.getTurnsTrapped() > 1)
		{
			Defender.setHP(Defender.getCurrentHP() - (int)Math.round(Defender.getMaxHP()/16));
			System.out.println(Defender.pokemon.name + " was squeezed by it's BIND!");
			Defender.setTurnsTrapped(Defender.getTurnsTrapped() - 1);
		}
		else if(Defender.getTurnsTrapped() == 1)
		{
			Defender.setHP(Defender.getCurrentHP() - (int)Math.round(Defender.getMaxHP()/8));
			//Defender.setFreed();
			System.out.println(Defender.pokemon.name + " was squeezed by it's BIND!");
			Defender.setTurnsTrapped(Defender.getTurnsTrapped() - 1);
			//System.out.println(Defender.pokemon.name + " was freed from " + Attacker.pokemon.name + "'s BIND!");
		}
		else if(Defender.getTurnsTrapped() == 0)
		{
			//Defender.setHP(Defender.getCurrentHP() - (int)Math.round(Defender.getMaxHP()/8));
			Defender.setFreed();
			//System.out.println(Defender.pokemon.name + " was squeezed by " + Attacker.pokemon.name + "'s BIND!");
			System.out.println(Defender.pokemon.name + " was freed from it's BIND!");
		}
	}
}
