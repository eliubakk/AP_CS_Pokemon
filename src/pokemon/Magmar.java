package pokemon;

import moves.*;
import red.PokemonGame;

public class Magmar extends Poke
{
	public Magmar()
	{
		super("Magmar", 126, PokemonGame.Fire, null, 65, 95, 57, 100, 85, 93);
		moveSetter();
	//	evolveSetter(121, 105);
		super.setEVYield(new int[]{0, 0, 0, 2, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Ember(), new Leer(), new ConfuseRay(), new FirePunch(), new Smokescreen(), new Smog(), new Flamethrower()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 36, 39, 43, 48, 52, 55}, {1, 5, 6, 8, 9, 10, 15, 17, 18, 19, 20, 29, 30, 31, 32, 34, 35, 38, 40, 44, 46, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
