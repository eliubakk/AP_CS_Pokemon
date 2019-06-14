package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class ThunderWave extends Move
{
	public ThunderWave()
	{
		super("Thunder Wave", PokemonGame.Electric, 2, 20, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Paralyzes that target, does not work on ground type pokemon
		Defender.setCondition(4);
	}
}
