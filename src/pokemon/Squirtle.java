package pokemon;

import moves.*;
import red.PokemonGame;

public class Squirtle extends Poke
{
	public Squirtle()
	{
		super("Squirtle", 7, PokemonGame.Water, null, 44, 48, 65, 50, 64, 43);
		moveSetter();
		evolveSetter(16, 8);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new TailWhip(), new BubbleBeam(), new WaterGun(), new Bite(), new Withdraw(), /*new SkullBash(),*/ new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 8, 15, 22, 28, 35, 42}, {1, 5, 6, 8, 10, 11, 12, 13, 14, 17, 18, 19, 20, 28, 31, 32, 33, 34, 40, 44, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}