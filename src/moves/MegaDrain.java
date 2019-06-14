package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class MegaDrain extends Move
{
	public MegaDrain()
	{
		super("Mega Drain", PokemonGame.Grass, 1, 15, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//user recovers 50% of hp drained.
		if(Attacker.getCurrentHP() + (int)Math.round(Damage/2) < Attacker.getMaxHP())
			Attacker.setHP(Attacker.getCurrentHP() + Damage/2);
		else 
			Attacker.setHP(Attacker.getMaxHP());
		System.out.println(Attacker.pokemon.name + " Gained some health.");
	}
}
