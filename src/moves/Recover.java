package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Recover extends Move
{
	public Recover()
	{
		super("Recover", PokemonGame.Normal, 2, 10, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//restores up to 50% of the users max HP
		if(Attacker.getCurrentHP() + Attacker.getMaxHP()/2 > Attacker.getMaxHP())
			Attacker.setHP(Attacker.getMaxHP());
		else
			Attacker.setHP(Attacker.getCurrentHP() + Attacker.getMaxHP()/2);
		System.out.println(Attacker.getPoke().name + " recovered some health!");
	}
}
