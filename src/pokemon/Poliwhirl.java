package pokemon;

import moves.*;
import red.PokemonGame;

public class Poliwhirl extends Poke
{
	public Poliwhirl()
	{
		super("Poliwhirl", 61, PokemonGame.Water, null, 65, 65, 65, 50, 50, 90);
		moveSetter();
		evolveSetter(62, 104);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new BubbleBeam(), new Hypnosis(), new WaterGun(), new DoubleSlap(), new BodySlam(), new Amnesia(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 26, 33, 41, 49}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 26, 27, 29, 31, 32, 34, 35, 40, 44, 46, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}