package pokemon;

import moves.*;
import red.PokemonGame;

public class Ekans extends Poke
{
	public Ekans()
	{
		super("Ekans", 23, PokemonGame.Poison, null, 35, 60, 44, 40, 54, 55);
		moveSetter();
		evolveSetter(24, 22);
		super.setEVYield(new int[]{0, 1, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Wrap(), new Leer(), new PoisonSting(), new Bite(), new Glare(), new Screech(), new Acid()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 10, 17, 24, 31, 38}, {6, 8, 9, 10, 20, 21, 26, 27, 28, 31, 32, 34, 40, 44, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}