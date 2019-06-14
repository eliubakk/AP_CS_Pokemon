package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Rest extends Move
{
	public Rest()
	{
		super("Rest", PokemonGame.Psychic, 2, 10, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//The user falls asleep for 3 turns. Its hp is restored and status aliments cured.
		//Attacker.removeCondition();
		Attacker.setCondition(1);
		//Attacker.setConditionDuration(3);
	}
}
