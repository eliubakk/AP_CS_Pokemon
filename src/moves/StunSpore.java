package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class StunSpore extends Move
{
	public StunSpore()
	{
		super("Stun Spore", PokemonGame.Grass, 0, 30, 0, 75, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Paralyzes the target
		Defender.setCondition(4);
	}
}
