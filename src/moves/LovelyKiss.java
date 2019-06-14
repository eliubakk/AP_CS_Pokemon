package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class LovelyKiss extends Move
{
	public LovelyKiss()
	{
		super("Lovely Kiss", PokemonGame.Normal, 2, 10, 0, 75, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//causes the target to fall asleep
		if(!Defender.hasCondition())
		{
			Defender.setCondition(1);
		}
	}
}
