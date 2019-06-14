package pokemon;

import moves.*;
import red.PokemonGame;

public class Voltorb extends Poke
{
	public Voltorb()
	{
		super("Voltorb", 100, PokemonGame.Electric, null, 40, 30, 50, 55, 55, 100);
		moveSetter();
		evolveSetter(101, 30);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Screech(), new SonicBoom(), new SelfDestruct(), new LightScreen(), new Swift(), new Explosion()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 17, 22, 29, 36, 43}, {6, 9, 20, 24, 25, 30, 31, 32, 33, 34, 36, 39, 44, 45, 47, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
