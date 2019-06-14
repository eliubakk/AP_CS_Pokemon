package pokemon;

import moves.*;
import red.PokemonGame;

public class Meowth extends Poke
{
	public Meowth()
	{
		super("Meowth", 52, PokemonGame.Normal, null, 40, 45, 35, 40, 40, 90);
		moveSetter();
		evolveSetter(53, 28);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Growl(), new Bite(), new PayDay(), new Screech(), new FurySwipes(), new Slash()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 12, 17, 24, 33, 44}, {6, 8, 9, 10, 11, 12, 16, 20, 24, 25, 31, 32, 34, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}