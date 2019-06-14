package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class PoisonPowder extends Move
{
	public PoisonPowder()
	{
		super("Poison Powder", PokemonGame.Poison, 2, 35, 0, 75, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Poisons the target
		Defender.setCondition(2);
	}
}
