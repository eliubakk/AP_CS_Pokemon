package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Submission extends Move
{
	public Submission()
	{
		super("Submission", PokemonGame.Fighting, 0, 25, 35, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//User recieves recoil damage equal to 25% of the damage.
		if(Attacker.getCurrentHP() - (int)Math.round(Damage/4.0) < 0)
			Attacker.setHP(0);
		else 
			Attacker.setHP(Attacker.getCurrentHP() - (int)Math.round(Damage/4.0));
		System.out.println(Attacker.pokemon.name + " was damaged by recoil.");	 
	}
}
