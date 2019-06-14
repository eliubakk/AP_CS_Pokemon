package pokemon;

import moves.*;
import red.PokemonGame;

public class Clefairy extends Poke
{
	public Clefairy()
	{
		super("Clefairy", 35, PokemonGame.Normal, null, 70, 45, 48, 60, 65, 35);
		moveSetter();
		evolveSetter(36, 102);
		super.setEVYield(new int[]{2, 0, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Pound(), new Growl(), new Sing(), new DoubleSlap(), new Minimize(), new Metronome(), new DefenseCurl(), new LightScreen()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 13, 18, 24, 31, 39, 48}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 22, 24, 25, 29, 31, 32, 33, 34, 35, 38, 40, 44, 45, 46, 49, 50, 104, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
