package pokemon;

import moves.*;
import red.PokemonGame;

public class Metapod extends Poke
{
	public Metapod()
	{
		super("Metapod", 11, PokemonGame.Bug, null, 50, 20, 55, 25, 25, 30);
		moveSetter();
		evolveSetter(10, 12);
		super.setEVYield(new int[]{0, 0, 2, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Harden()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0}, {}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
