package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class LeechLife extends Move
{
	public LeechLife()
	{
		super("Leech Life", PokemonGame.Bug, 0, 15, 20, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//50% of the damage dealt to the target is restored to the user as HP
		if(Attacker.getCurrentHP() + (int)Math.round(Damage/2) < Attacker.getMaxHP())
			Attacker.setHP(Attacker.getCurrentHP() + Damage/2);
		else 
			Attacker.setHP(Attacker.getMaxHP());
		System.out.println(Attacker.pokemon.name + " Gained some health.");
	}
}
