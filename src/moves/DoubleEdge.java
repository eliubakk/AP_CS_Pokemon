package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class DoubleEdge extends Move
{
	public DoubleEdge()
	{
		super("Double-Edge", PokemonGame.Normal, 0, 15, 120, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Attacker recieves recoil equal to 1/3 of the damage
		if(Attacker.getCurrentHP() - (int)Math.round(Damage/3.0) < 0)
			Attacker.setHP(0);
		else 
			Attacker.setHP(Attacker.getCurrentHP() - (int)Math.round(Damage/3.0));
		System.out.println(Attacker.pokemon.name + " was damaged by recoil.");	 
	}
}
