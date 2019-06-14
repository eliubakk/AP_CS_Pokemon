package pokemon;

import moves.*;
import red.PokemonGame;

public class Arcanine extends Poke
{
	public Arcanine()
	{
		super("Arcanine", 59, PokemonGame.Fire, null, 90, 110, 80, 100, 80, 95);
		moveSetter();
	//	evolveSetter(59, 103);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Roar(), new Ember(), new Leer(), new TakeDown()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0}, {6, 8, 9, 10, 15, 20, 23, 28, 30, 31, 32, 33, 34, 38, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}