package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Bite extends Move
{
	public Bite()
	{
		super("Bite", PokemonGame.Dark, 0, 25, 60, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//30% chance to flinch
		int chance = genrand(1,100);
		if(chance <= 30)
		{
			Defender.setFlinched(true);
		}
	}
	
}
