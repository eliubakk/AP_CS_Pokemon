package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class HornDrill extends Move
{
	public HornDrill()
	{
		super("Horn Drill", PokemonGame.Normal, 0, 5, 0, 0, 1, 0);
	}
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
		double Damage = 0;
		//Random r = new Random();
		int randMax = 100;
		int randMin = 1;
		int hit = genrand(randMin, randMax);
		if(!attacker.getFlinched() && attacker.getLevel() > defender.getLevel() && !defender.isProtected())
		{
			if(hit <= (attacker.getLevel() - defender.getLevel() + 30))
			{
				double DamageMultiplier = this.getPokeType().getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));	
				if(DamageMultiplier == 0.0)
					System.out.println(defender.getPoke().name + " is immune!");
				else
					Damage = defender.getCurrentHP();
				secondaryEffect(attacker, defender, (int)Math.round(Damage));
			}
			if(hit > (attacker.getLevel() - defender.getLevel() + 30))
			{
				System.out.println(defender.pokemon.name + " avoided the move.");
				System.out.print(hit + " > ");
				System.out.println(attacker.getLevel() - defender.getLevel() + 30);
			}
		}
		else if(attacker.getFlinched())
		{
			System.out.println(attacker.getPoke().name + " flinched!");
		}
		else if(defender.isProtected())
		{
			System.out.println(defender.getPoke().name + " avoided the move!");
		}
		else 
		{
			System.out.println("But the move failed!");
		}
		lowerCurrentPP();
		return (int)Math.round(Damage);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//cannot affect a Pokémon of a higher level. The accuracy of Horn Drill depends on the level of the user and the level of the target and is worked out with the formula: Accuracy = ((level of user-level of target) + 30)%. Horn Drill ignores all changes to accuracy and evasion stats.
	}
}
