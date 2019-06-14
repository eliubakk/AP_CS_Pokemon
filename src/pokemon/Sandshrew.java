package pokemon;

import moves.*;
import red.PokemonGame;

public class Sandshrew extends Poke
{
	public Sandshrew()
	{
		super("Sandshrew", 27, PokemonGame.Ground, null, 50, 75, 85, 20, 30, 40);
		moveSetter();
		evolveSetter(28, 22);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new SandAttack(), new Slash(), new PoisonSting(), new Swift(), new FurySwipes()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 10, 17, 24, 31, 38}, {3, 6, 8, 9, 10, 17, 19, 20, 26, 27, 28, 31, 32, 34, 39, 40, 44, 48, 50, 101, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}