package pokemon;

import moves.*;
import red.PokemonGame;

public class Poliwrath extends Poke
{
	public Poliwrath()
	{
		super("Poliwrath", 62, PokemonGame.Water, PokemonGame.Fighting, 90, 85, 95, 70, 90, 70);
		moveSetter();
		//evolveSetter(62, 104);
		super.setEVYield(new int[]{0, 0, 3, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Hypnosis(), new WaterGun(), new DoubleSlap(), new BodySlam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 26, 27, 29, 31, 32, 34, 35, 40, 44, 46, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}