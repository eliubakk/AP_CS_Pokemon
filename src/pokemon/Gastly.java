package pokemon;

import moves.*;
import red.PokemonGame;

public class Gastly extends Poke
{
	public Gastly()
	{
		super("Gastly", 92, PokemonGame.Ghost, PokemonGame.Poison, 30, 35, 30, 100, 35, 80);
		moveSetter();
		evolveSetter(93, 25);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Lick(), new ConfuseRay(), new NightShade(), new Hypnosis(), new DreamEater()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 27, 35}, {6, 20, 21, 24, 25, 29, 31, 32, 34, 36, 42, 44, 46, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
