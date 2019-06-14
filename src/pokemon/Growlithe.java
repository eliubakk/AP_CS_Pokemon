package pokemon;

import moves.*;
import red.PokemonGame;

public class Growlithe extends Poke
{
	public Growlithe()
	{
		super("Growlithe", 58, PokemonGame.Fire, null, 55, 70, 45, 70, 50, 60);
		moveSetter();
		evolveSetter(59, 103);
		super.setEVYield(new int[]{0, 1, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Bite(), new Roar(), new Ember(), new Leer(), new TakeDown(), new Agility(), new Flamethrower()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 18, 23, 30, 39, 50}, {6, 8, 9, 10, 23, 28, 31, 32, 33, 34, 38, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}