package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class TriAttack extends Move
{
	public TriAttack()
	{
		super("Tri Attack", PokemonGame.Normal, 1, 10, 80, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Has a 20% chance to paralyze, freeze, or burn the target.
		if(!Defender.hasCondition())
		{
			int chance = genrand(1, 100);
			if(chance <= 20)
			{
				Defender.setCondition(genrand(4,6));
			}
		}
	}
}
