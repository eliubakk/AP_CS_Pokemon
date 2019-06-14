package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class AcidArmor extends Move
{
	public AcidArmor()
	{
		super("Acid Armor", PokemonGame.Poison, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//Raises user's DEFENSE two stages.
	{
		if(Attacker.raiseDefenseMultiplier())
		{
			if(Attacker.raiseDefenseMultiplier())
				System.out.println(Attacker.pokemon.name + "'s defense rose sharply.");
			else
				System.out.println(Attacker.pokemon.name + "'s defense can't go any higher.");
		}
		else 
			System.out.println(Attacker.pokemon.name + "'s defense can't go any higher.");
	}
}
