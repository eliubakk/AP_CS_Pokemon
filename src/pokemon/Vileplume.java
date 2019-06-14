package pokemon;

import moves.*;
import red.PokemonGame;

public class Vileplume extends Poke
{
	public Vileplume()
	{
		super("Vileplume", 45, PokemonGame.Grass, PokemonGame.Poison, 75, 80, 85, 100, 90, 50);
		moveSetter();
		//evolveSetter(45, 104);
		super.setEVYield(new int[]{0, 0, 0, 3, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Absorb(), new PoisonPowder(), new StunSpore(), new SleepPowder(), new Acid(), new PetalDance(), new SolarBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 19, 28, 38, 52}, {3, 6, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
