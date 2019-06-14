package pokemon;

import moves.*;
import red.PokemonGame;

public class Nidoqueen extends Poke
{
	public Nidoqueen()
	{
		super("Nidoqueen", 31, PokemonGame.Poison, PokemonGame.Ground, 90, 82, 87, 75, 85, 76);
		moveSetter();
		//evolveSetter(31, 102);
		super.setEVYield(new int[]{3, 0, 0, 0, 0, 0});}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Scratch(), new TailWhip(), new BodySlam(), new DoubleKick()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 12}, {1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 20, 24, 25, 26, 27, 31, 32, 33, 34, 40, 44, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
