package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class SonicBoom extends Move
{
	public SonicBoom()
	{
		super("Sonic Boom", PokemonGame.Normal, 1, 20, 0, 90, 1, 0);
	}
	
	public int Attack(SeenPokemon attacker, SeenPokemon defender)
	{
		double Damage = 0;
		//Random r = new Random();
		int randMax = 100;
		int randMin = 1;
		int hit = genrand(randMin, randMax);
		if(!attacker.getFlinched() && !defender.isProtected())
		{
			if(hit <= getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()))
			{
				double DamageMultiplier = this.getPokeType().getDamageMultiplier(defender.getType().get(0), defender.getType().get(1));
				if(DamageMultiplier > 1.0)
					System.out.println("It's super effective!");
				else if(DamageMultiplier < 1.0 && DamageMultiplier > 0.0)
					System.out.println("It's not very effective!");
				else if(DamageMultiplier == 0.0)
					System.out.println(defender.getPoke().name + " is immune!");
				if(DamageMultiplier != 0.0)
					Damage = 20;
				if(Damage > 0)
					System.out.println(defender.getPoke().name + " took damage!");
				//defender.setHP(defender.getCurrentHP() - (int)Damage);
				secondaryEffect(attacker, defender, (int)Math.round(Damage));
			}
			if(hit > getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()))
			{
				System.out.println(defender.pokemon.name + " avoided the move.");
				System.out.print(hit + " > ");
				System.out.println(getAccuracy() * (attacker.getAccuracyMultiplier()/defender.getEvasiveMultiplier()));
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
		lowerCurrentPP();
		return (int)Math.round(Damage);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Does exactly 20 Damage if it hits
	}
}
