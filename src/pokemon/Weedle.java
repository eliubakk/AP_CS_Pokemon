package pokemon;

import moves.*;
import red.PokemonGame;

public class Weedle extends Poke
{

	public Weedle()
	{
		super("Weedle", 13, PokemonGame.Bug, PokemonGame.Poison, 40, 35, 30, 20, 20, 50);
		moveSetter();
		evolveSetter(7, 14);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new PoisonSting(), new StringShot()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0}, {}};
		super.setMoveLevel(moveLevel);
	}
	
}
