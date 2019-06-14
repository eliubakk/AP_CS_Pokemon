package pokemon;

import moves.*;
import red.PokemonGame;

public class Diglett extends Poke
{
	public Diglett()
	{
		super("Diglett", 50, PokemonGame.Ground, null, 10, 55, 25, 35, 45, 95);
		moveSetter();
		evolveSetter(51, 26);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Growl(), new Dig(), new SandAttack(), new Slash(), new Earthquake()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 15, 19, 24, 31, 40}, {6, 8, 9, 10, 20, 26, 27, 28, 31, 32, 34, 44, 48, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}