package pokemon;

import moves.*;
import red.PokemonGame;

public class Tauros extends Poke
{
	public Tauros()
	{
		super("Tauros", 128, PokemonGame.Normal, null, 75, 100, 95, 40, 70, 110);
		moveSetter();
		//evolveSetter(121, 105);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Stomp(), new TailWhip(), new Leer(), new Rage(), new TakeDown()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 21, 28, 35, 44, 51}, {6, 7, 8, 9, 10, 13, 14, 15, 20, 24, 25, 26, 27, 31, 32, 34, 38, 40, 44, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
