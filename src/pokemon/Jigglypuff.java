package pokemon;

import moves.*;
import red.PokemonGame;

public class Jigglypuff extends Poke
{
	public Jigglypuff()
	{
		super("Jigglypuff", 39, PokemonGame.Normal, null, 115, 45, 20, 45, 25, 20);
		moveSetter();
		evolveSetter(40, 102);
		super.setEVYield(new int[]{2, 0, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Sing(), new Pound(), new Disable(), new DefenseCurl(), new DoubleSlap(), new Rest(), new BodySlam(), new DoubleEdge()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 9, 14, 19, 24, 29, 34, 39}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 22, 24, 25, 29, 30, 31, 32, 33, 34, 38, 40, 44, 45, 46, 49, 49, 50, 104, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
