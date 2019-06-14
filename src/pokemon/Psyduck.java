package pokemon;

import moves.*;
import red.PokemonGame;

public class Psyduck extends Poke
{
	public Psyduck()
	{
		super("Psyduck", 54, PokemonGame.Water, null, 54, 52, 48, 65, 50, 55);
		moveSetter();
		evolveSetter(55, 33);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new TailWhip(), new Disable(), new Confusion(), new FurySwipes(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 28, 31, 36, 43, 52}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 28, 31, 32, 34, 39, 40, 44, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}