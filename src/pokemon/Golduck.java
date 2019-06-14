package pokemon;

import moves.*;
import red.PokemonGame;

public class Golduck extends Poke
{
	public Golduck()
	{
		super("Golduck", 55, PokemonGame.Water, null, 80, 82, 78, 95, 80, 85);
		moveSetter();
		//evolveSetter(55, 33);
		super.setEVYield(new int[]{0, 0, 0, 2, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new TailWhip(), new Disable(), new Confusion(), new FurySwipes(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 39, 48, 59}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 28, 31, 32, 34, 39, 40, 44, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}