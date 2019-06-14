package pokemon;

import moves.*;
import red.PokemonGame;

public class Caterpie extends Poke
{
	public Caterpie()
	{
		super("Caterpie", 10, PokemonGame.Bug, null, 45, 30, 35, 20, 20, 45);
		moveSetter();
		evolveSetter(7, 11);
		super.setEVYield(new int[]{1, 0, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new StringShot()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0}, {}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
