package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class HyperFang extends Move
{
	public HyperFang()
	{
		super("Hyper Fang", PokemonGame.Normal, 0, 15, 80, 90, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance to flinch
		int chance = genrand(1,100);
		if(chance <= 10)
		{
			Defender.setFlinched(true);
		}
	}
}
