package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Stomp extends Move
{
	public Stomp()
	{
		super("Stomp", PokemonGame.Normal, 0, 20, 65, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//May cause opponent to flinch. 30%
		int chance = genrand(1,100);
		if(chance <= 30)
		{
			Defender.setFlinched(true);
		}
	}
}
