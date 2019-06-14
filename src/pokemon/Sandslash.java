package pokemon;

import moves.*;
import red.PokemonGame;

public class Sandslash extends Poke
{
	public Sandslash()
	{
		super("Sandslash", 28, PokemonGame.Ground, null, 75, 100, 110, 45, 55, 65);
		moveSetter();
	//	evolveSetter(28, 22);
		super.setEVYield(new int[]{0, 0, 2, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new SandAttack(), new Slash(), new PoisonSting(), new Swift(), new FurySwipes()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 17, 27, 36, 47}, {3, 6, 8, 9, 10, 15, 17, 19, 20, 26, 27, 28, 31, 32, 34, 39, 40, 44, 48, 50, 101, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}