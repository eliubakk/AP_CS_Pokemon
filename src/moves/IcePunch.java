package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class IcePunch extends Move
{
	public IcePunch()
	{
		super("Ice Punch", PokemonGame.Ice, 0, 15, 75, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//May induce freeze 10%
	{
		int chance = genrand(1,100);
		if(chance <= 10 && !Defender.hasCondition())
		{
			Defender.setCondition(6);
		}
	}
}
