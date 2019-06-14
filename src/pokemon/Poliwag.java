package pokemon;

import moves.*;
import red.PokemonGame;

public class Poliwag extends Poke
{
	public Poliwag()
	{
		super("Poliwag", 60, PokemonGame.Water, null, 40, 50, 40, 40, 40, 90);
		moveSetter();
		evolveSetter(61, 25);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new BubbleBeam(), new Hypnosis(), new WaterGun(), new DoubleSlap(), new BodySlam(), new Amnesia(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 16, 19, 25, 31, 38, 45}, {6, 8, 9, 10, 11, 12, 13, 14, 20, 29, 31, 32, 34, 40, 44, 46, 50, 103}};
		super.setMoveLevel(moveLevel);
	}
	
	
}