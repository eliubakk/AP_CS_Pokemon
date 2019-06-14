package pokemon;

import moves.*;
import red.PokemonGame;

public class Arbok extends Poke
{
	public Arbok()
	{
		super("Arbok", 24, PokemonGame.Poison, null, 60, 85, 69, 65, 79, 80);
		moveSetter();
		//evolveSetter(24, 22);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Wrap(), new Leer(), new PoisonSting(), new Bite(), new Glare(), new Screech(), new Acid()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 17, 27, 36, 47}, {6, 8, 9, 10, 15, 20, 21, 26, 27, 28, 31, 32, 34, 40, 44, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}