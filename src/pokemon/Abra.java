package pokemon;

import moves.*;
import red.PokemonGame;

public class Abra extends Poke
{
	public Abra()
	{
		super("Abra", 63, PokemonGame.Psychic, null, 25, 20, 15, 105, 55, 90);
		moveSetter();
		evolveSetter(64, 16);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Teleport()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0}, {1, 5, 6, 8, 9, 10, 17, 18, 19, 20, 29, 30, 31, 32, 33, 34, 35, 40, 44, 45, 46, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}