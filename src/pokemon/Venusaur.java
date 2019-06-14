package pokemon;


import moves.*;
import red.PokemonGame;

public class Venusaur extends Poke
{
	
	public Venusaur()
	{
		super("Venusaur", 3, PokemonGame.Grass, PokemonGame.Poison, 80, 82, 83, 100, 100, 80);
		moveSetter();
		//super.evolveSetter(32, 3);
		super.setEVYield(new int[]{0, 0, 0, 2, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Growl(), new LeechSeed(), new VineWhip(), new PoisonPowder(), new RazorLeaf(), new Growth(), new SleepPowder(), new SolarBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 22, 30, 43, 55, 65}, {3, 6, 8, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}

}