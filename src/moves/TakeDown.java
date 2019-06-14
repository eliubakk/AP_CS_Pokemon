package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class TakeDown extends Move
{
	public TakeDown()
	{
		super("Take Down", PokemonGame.Normal, 0, 20, 90, 85, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//user receives recoil damage equal to 25% of the damage done to the opponent.
		if(Attacker.getCurrentHP() - (int)Math.round(Damage/4.0) < 0)
			Attacker.setHP(0);
		else 
			Attacker.setHP(Attacker.getCurrentHP() - (int)Math.round(Damage/4.0));
		System.out.println(Attacker.pokemon.name + " was damaged by recoil.");	 
	}
}
