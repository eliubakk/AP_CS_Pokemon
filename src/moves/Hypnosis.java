package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Hypnosis extends Move
{
	public Hypnosis()
	{
		super("Hypnosis", PokemonGame.Psychic, 2, 20, 0, 60, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Puts the target to sleep
		if(!Defender.hasCondition())
		{
			Defender.setCondition(1);
		}
	}
}
