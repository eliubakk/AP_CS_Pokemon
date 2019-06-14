package pokemon;

import moves.*;
import red.PokemonGame;

public class Dugtrio extends Poke
{
	public Dugtrio()
	{
		super("Dugtrio", 51, PokemonGame.Ground, null, 35, 80, 50, 50, 70, 120);
		moveSetter();
		//evolveSetter(51, 31);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Growl(), new Dig(), new SandAttack(), new Slash(), new Earthquake()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 24, 35, 47}, {6, 8, 9, 10, 15, 20, 26, 27, 28, 31, 32, 34, 44, 48, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}