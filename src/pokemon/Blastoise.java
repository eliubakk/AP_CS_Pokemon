package pokemon;

import moves.*;
import red.PokemonGame;

public class Blastoise extends Poke
{
	public Blastoise()
	{
		super("Blastiose", 9, PokemonGame.Water, null, 79, 83, 100, 85, 105, 78);
		moveSetter();
		//evolveSetter(36, 9);
		super.setEVYield(new int[]{0, 0, 0, 0, 3, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new TailWhip(), new BubbleBeam(), new WaterGun(), new Bite(), new Withdraw(), new SkullBash(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 24, 31, 42, 52}, {1, 5, 6, 8, 10, 11, 12, 13, 14, 17, 18, 19, 20, 28, 31, 32, 33, 34, 40, 44, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}