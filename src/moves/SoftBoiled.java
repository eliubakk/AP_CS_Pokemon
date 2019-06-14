package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class SoftBoiled extends Move
{
	public SoftBoiled()
	{
		super("Soft-Boiled", PokemonGame.Normal, 2, 10, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//can restore up to 50% of the users maximum HP
		if(Attacker.getCurrentHP() + Attacker.getMaxHP()/2 > Attacker.getMaxHP())
			Attacker.setHP(Attacker.getMaxHP());
		else
			Attacker.setHP(Attacker.getCurrentHP() + Attacker.getMaxHP()/2);
		System.out.println(Attacker.getPoke().name + " recovered some health!");
	}
}
