package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Toxic extends Move
{
	public Toxic()
	{
		super("Toxic", PokemonGame.Poison, 2, 10, 0, 90, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Badly Poisons the defender
		if(!Defender.getCondition().equals("Poisoned") && !Defender.hasCondition())
			Defender.setCondition(3);
		else
			System.out.println(Defender.getPoke().name + " can't be Poisoned.");
	}
}
