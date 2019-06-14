package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class RockSlide extends Move
{
	public RockSlide()
	{
		super("Rock Slide", PokemonGame.Rock, 0, 10, 75, 90, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//30% chance to flinch
		int chance = genrand(1,100);
		if(chance <= 30)
		{
			Defender.setFlinched(true);
		}
	}
}
