package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class FireSpin extends Move
{
	public FireSpin()
	{
		super("Fire Spin", PokemonGame.Fire, 1, 15, 35, 85, 1, 0);
	}
	
		//Traps the target for 2-5 turns (same chances as with bind) trapped pokemon can't switch out.  does damage equal to 1/16 of the pokemon's maximumhealth.
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Traps opponent. for 2-5 turns 
		if(!Defender.isTrapped())
		{	
			double chance = genrand(1,1000)/10.0;
			if(chance > 62.5)
			{
				Defender.setTrapped("Fire Spin", 2);
			}
			else if(chance > 25.0)
			{
				Defender.setTrapped("Fire Spin", 3);
			}
			else if(chance > 12.5)
			{
				Defender.setTrapped("Fire Spin", 4);
			}
			else if(chance > 0.0)
			{
				Defender.setTrapped("Fire Spin", 5);
			}
			System.out.println(Defender.getPoke().name + " was trapped in a fiery vortex!");
		}
	}
	public void tertiaryEffect(SeenPokemon Defender)
	{
		if(Defender.getTurnsTrapped() > 1)
		{
			Defender.setHP(Defender.getCurrentHP() - (int)Math.round(Defender.getMaxHP()/16));
			System.out.println(Defender.pokemon.name + " was damaged by the fiery vortex!");
			Defender.setTurnsTrapped(Defender.getTurnsTrapped() - 1);
		}
		else if(Defender.getTurnsTrapped() == 1)
		{
			Defender.setHP(Defender.getCurrentHP() - (int)Math.round(Defender.getMaxHP()/8));
			//Defender.setFreed();
			System.out.println(Defender.pokemon.name + " was damaged by the fiery vortex!");
			Defender.setTurnsTrapped(Defender.getTurnsTrapped() - 1);
			//System.out.println(Defender.pokemon.name + " was freed from " + Attacker.pokemon.name + "'s BIND!");
		}
		else if(Defender.getTurnsTrapped() == 0)
		{
			//Defender.setHP(Defender.getCurrentHP() - (int)Math.round(Defender.getMaxHP()/8));
			Defender.setFreed();
			//System.out.println(Defender.pokemon.name + " was squeezed by " + Attacker.pokemon.name + "'s BIND!");
			System.out.println(Defender.pokemon.name + " was freed from the fiery vortex!");
		}
	}
}
