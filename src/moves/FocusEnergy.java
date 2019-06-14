package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class FocusEnergy extends Move
{
	public FocusEnergy()
	{
		super("Focus Energy", PokemonGame.Normal, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Increases the critical hit ratio by 1 stage
		Attacker.setCriticalHitChance(1);
	}
}
