package pokemon;

import moves.*;
import red.PokemonGame;

public class Persian extends Poke
{
	public Persian()
	{
		super("Persian", 53, PokemonGame.Normal, null, 65, 70, 60, 65, 65, 115);
		moveSetter();
		//evolveSetter(53, 28);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Growl(), new Bite(), new Screech(), new PayDay(), new FurySwipes(), new Slash()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 17, 24, 37, 51}, {6, 8, 9, 10, 11, 12, 15, 16, 20, 24, 25, 31, 32, 34, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}