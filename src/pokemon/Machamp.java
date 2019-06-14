package pokemon;

import moves.*;
import red.PokemonGame;

public class Machamp extends Poke
{
	public Machamp()
	{
		super("Machamp", 68, PokemonGame.Fighting, null, 90, 130, 80, 65, 85, 55);
		moveSetter();
		//evolveSetter(67, 28);
		super.setEVYield(new int[]{0, 3, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new KarateChop(), new LowKick(), new Leer(), new FocusEnergy(), new SeismicToss(), new Submission()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 36, 44, 52}, {1, 5, 6, 8, 9, 10, 15, 17, 18, 19, 20, 26, 27, 28, 31, 32, 34, 35, 38, 40, 44, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}