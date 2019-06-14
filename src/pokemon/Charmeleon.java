package pokemon;

import moves.*;
import red.PokemonGame;

public class Charmeleon extends Poke
{
	public Charmeleon()
	{
		super("Charmeleon", 5, PokemonGame.Fire, null, 58, 64, 58, 80, 65, 80);
		moveSetter();
		evolveSetter(36, 6);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Growl(), new Ember(), new Leer(), new Rage(), new Slash(), new Flamethrower(), new FireSpin()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 15, 24, 33, 42, 56}, {1, 3, 5, 6, 8, 9, 10, 17, 18, 19, 20, 23, 28, 31, 32, 33, 34, 38, 39, 40, 44, 50, 101, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}