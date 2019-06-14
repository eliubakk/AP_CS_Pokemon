package pokemon;

import moves.*;
import red.PokemonGame;

public class Machop extends Poke
{
	public Machop()
	{
		super("Machop", 66, PokemonGame.Fighting, null, 70, 80, 50, 35, 35, 35);
		moveSetter();
		evolveSetter(67, 28);
		super.setEVYield(new int[]{0, 1, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new KarateChop(), new LowKick(), new Leer(), new FocusEnergy(), new SeismicToss(), new Submission()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 20, 25, 32, 39, 46}, {1, 5, 6, 8, 9, 10, 17, 18, 19, 20, 26, 27, 28, 31, 32, 34, 35, 38, 40, 44, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}