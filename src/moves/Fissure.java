package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Fissure extends Move
{
	public Fissure()
	{
		super("Fissure", PokemonGame.Ground, 0, 5, 0, 0, 1, 0);
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
		//deals damage equal to that of the defenders current HP.  Accuracy is equal to the level of the user - the level of the target + 30.  Can not affect a pokemon of a higher level
	}
}
