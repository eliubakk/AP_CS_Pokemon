package pokemon;

import moves.*;
import red.PokemonGame;

public class Vulpix extends Poke
{
	public Vulpix()
	{
		super("Vulpix", 37, PokemonGame.Fire, null, 38, 41, 40, 50, 65, 65);
		moveSetter();
		evolveSetter(38, 103);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Ember(), new TailWhip(), new QuickAttack(), new Roar(), new ConfuseRay(), new Flamethrower(), new FireSpin()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 16, 21, 28, 35, 42}, {6, 8, 9, 10, 20, 28, 31, 32, 33, 34, 38, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
