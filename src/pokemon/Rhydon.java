package pokemon;

import moves.*;
import red.PokemonGame;

public class Rhydon extends Poke
{
	public Rhydon()
	{
		super("Rhydon", 112, PokemonGame.Ground, PokemonGame.Rock, 105, 130, 120, 45, 45, 40);
		moveSetter();
		//evolveSetter(112, 42);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new HornAttack(), new Stomp(), new TailWhip(), new FuryAttack(), new HornDrill(), new Leer(), new TakeDown()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 48, 55, 64}, {1 , 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 24, 25, 26, 27, 28, 31, 32, 34, 38, 44, 47, 48, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
