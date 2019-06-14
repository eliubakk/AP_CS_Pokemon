package pokemon;

import moves.*;
import red.PokemonGame;

public class Wigglytuff extends Poke
{
	public Wigglytuff()
	{
		super("Wigglytuff", 40, PokemonGame.Normal, null, 140, 70, 45, 75, 50, 45);
		moveSetter();
		//evolveSetter(40, 102);
		super.setEVYield(new int[]{3, 0, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Sing(), new Disable(), new DefenseCurl(), new DoubleSlap()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 22, 24, 25, 29, 30, 31, 32, 33, 34, 38, 40, 44, 45, 46, 49, 49, 50, 104, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
