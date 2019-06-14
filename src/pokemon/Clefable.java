package pokemon;

import moves.*;
import red.PokemonGame;

public class Clefable extends Poke
{
	public Clefable()
	{
		super("Clefable", 36, PokemonGame.Normal, null, 95, 70, 73, 85, 90, 60);
		moveSetter();
	//	evolveSetter(36, 102);
		super.setEVYield(new int[]{3, 0, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Sing(), new DoubleSlap(), new Minimize(), new Metronome()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0 , 0, 0}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 22, 24, 25, 29, 31, 32, 33, 34, 35, 38, 40, 44, 45, 46, 49, 50, 104, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
