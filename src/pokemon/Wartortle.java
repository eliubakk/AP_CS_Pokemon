package pokemon;

import moves.*;
import red.PokemonGame;

public class Wartortle extends Poke
{
	public Wartortle()
	{
		super("Wartortle", 8, PokemonGame.Water, null, 59, 63, 80, 65, 80, 58);
		moveSetter();
		evolveSetter(36, 9);
		super.setEVYield(new int[]{0, 0, 1, 0, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new TailWhip(), new BubbleBeam(), new WaterGun(), new Bite(), new Withdraw(), new SkullBash(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 15, 24, 31, 39, 47}, {1, 5, 6, 8, 10, 11, 12, 13, 14, 17, 18, 19, 20, 28, 31, 32, 33, 34, 40, 44, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}