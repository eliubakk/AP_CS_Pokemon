package pokemon;

import moves.*;
import red.PokemonGame;

public class Kangaskhan extends Poke
{
	public Kangaskhan()
	{
		super("Kangaskhan", 115, PokemonGame.Normal, null, 105, 95, 80, 40, 80, 90);
		moveSetter();
		//evolveSetter(112, 42);
		super.setEVYield(new int[]{2, 0, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new CometPunch(), new Rage(), new Bite(), new TailWhip(), new MegaPunch(), new Leer(), new DizzyPunch()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 26, 31, 36, 41, 46}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 24, 25, 26, 27, 31, 32, 34, 38, 40, 44, 48, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
