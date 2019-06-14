package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class BoneClub extends Move
{
	public BoneClub()
	{
		super("Bone Club", PokemonGame.Ground, 0, 20, 65, 85, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance to flinch.
		int chance = genrand(1,100);
		if(chance <= 10)
		{
			Defender.setFlinched(true);
		}
	}
}
