package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Headbutt extends Move
{
	public Headbutt()
	{
		super("Headbutt", PokemonGame.Normal, 0, 15, 70, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//May cause opponent to flinch. 30% chance
		int chance = genrand(1,100);
		if(chance <= 30)
		{
			Defender.setFlinched(true);
		}
	}
}
