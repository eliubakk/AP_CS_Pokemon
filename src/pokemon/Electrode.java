package pokemon;

import moves.*;
import red.PokemonGame;

public class Electrode extends Poke
{
	public Electrode()
	{
		super("Electrode", 101, PokemonGame.Electric, null, 60, 50, 70, 80, 80, 140);
		moveSetter();
		//evolveSetter(101, 30);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2}); //unknown though
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Screech(), new SonicBoom(), new SelfDestruct(), new LightScreen(), new Swift(), new Explosion()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 22, 29, 40, 50}, {6, 9, 15, 20, 24, 25, 30, 31, 32, 33, 34, 36, 39, 44, 45, 47, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}

