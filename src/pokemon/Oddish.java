package pokemon;

import moves.*;
import red.PokemonGame;

public class Oddish extends Poke
{
	public Oddish()
	{
		super("Oddish", 43, PokemonGame.Grass, PokemonGame.Poison, 45, 50, 55, 75, 65, 30);
		moveSetter();
		evolveSetter(44, 21);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Absorb(), new PoisonPowder(), new StunSpore(), new SleepPowder(), new Acid(), new PetalDance(), new SolarBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 15, 17, 19, 24, 33, 46}, {3, 6, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}