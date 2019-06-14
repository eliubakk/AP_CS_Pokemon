package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class IceBeam extends Move
{
	public IceBeam()
	{
		super("Ice Beam", PokemonGame.Ice, 1, 10, 95, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance of freezing
		int chance = genrand(1,100);
		if(chance <= 10 && !Defender.hasCondition())
		{
			Defender.setCondition(6);
		}
	}
}
