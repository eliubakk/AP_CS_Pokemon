package pokemon;

import moves.*;
import red.PokemonGame;

public class Staryu extends Poke
{
	public Staryu()
	{
		super("Staryu", 120, PokemonGame.Water, null, 30, 45, 55, 70, 55, 85);
		moveSetter();
		evolveSetter(121, 105);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new WaterGun(), new Harden(), new Recover(), new Swift(), new Minimize(), new LightScreen(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 17, 22, 27, 32, 37, 42, 47}, {6, 9, 10, 11, 12, 13, 14, 20, 24, 25, 29, 30, 31, 32, 33, 34, 39, 40, 44, 45, 46, 49, 50, 103, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
