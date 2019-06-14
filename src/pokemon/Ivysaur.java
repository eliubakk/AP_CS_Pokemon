package pokemon;

import moves.*;
import red.PokemonGame;

public class Ivysaur extends Poke
{
	
	public Ivysaur()
	{
		super("Ivysaur", 2, PokemonGame.Grass, PokemonGame.Poison, 60, 62, 63, 80, 80, 60);
		moveSetter();
		super.evolveSetter(32, 3);
		super.setEVYield(new int[]{0, 0, 0, 1, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Growl(), new LeechSeed(), new VineWhip(), new PoisonPowder(), new RazorLeaf(), new Growth(), new SleepPowder(), new SolarBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 13, 22, 30, 38, 46, 54}, {3, 6, 8, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}

}