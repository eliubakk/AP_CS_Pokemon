package pokemon;

import moves.*;
import red.PokemonGame;

public class Machoke extends Poke
{
	public Machoke()
	{
		super("Machoke", 67, PokemonGame.Fighting, null, 80, 100, 70, 50, 60, 45);
		moveSetter();
		evolveSetter(68, 110);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new KarateChop(), new LowKick(), new Leer(), new FocusEnergy(), new SeismicToss(), new Submission()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 36, 44, 52}, {1, 5, 6, 8, 9, 10, 17, 18, 19, 20, 26, 27, 28, 31, 32, 34, 35, 38, 40, 44, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}