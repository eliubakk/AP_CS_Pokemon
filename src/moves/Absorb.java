package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Absorb extends Move
{
	
	public Absorb() 
	{
		super("Absorb", PokemonGame.Grass, 1, 25, 20, 100, 1, 0); 
	}
	
	public void secondaryEffect(SeenPokemon Attacker , SeenPokemon Defender, int Damage) //gain 50% of the damage is added
	{
		if(Attacker.getCurrentHP() + (int)Math.round(Damage/2) < Attacker.getMaxHP())
			Attacker.setHP(Attacker.getCurrentHP() + Damage/2);
		else 
			Attacker.setHP(Attacker.getMaxHP());
		System.out.println(Attacker.pokemon.name + " Gained some health.");
	}
	
}
