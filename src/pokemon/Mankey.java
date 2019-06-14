package pokemon;

import moves.*;
import red.PokemonGame;

public class Mankey extends Poke
{
	public Mankey()
	{
		super("Mankey", 56, PokemonGame.Fighting, null, 40, 80, 35, 35, 45, 70);
		moveSetter();
		evolveSetter(57, 28);
		super.setEVYield(new int[]{0, 1, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Leer(), new LowKick(), new KarateChop(), new FurySwipes(), new FocusEnergy(), new SeismicToss(), new Thrash(), new Screech()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 9, 15, 21, 27, 33, 39, 45}, {1, 5, 6, 8, 9, 10, 16, 17, 18, 19, 20, 24, 25, 28, 31, 32, 34, 35, 39, 40, 44, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}