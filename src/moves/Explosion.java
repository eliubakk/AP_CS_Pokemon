package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Explosion extends Move
{
	public Explosion()
	{
		super("Explosion", PokemonGame.Normal, 0, 5, 250, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//User faints before dealing damage.
		Attacker.setHP(0);
	}
}
