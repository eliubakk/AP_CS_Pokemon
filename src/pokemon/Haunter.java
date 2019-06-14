package pokemon;

import moves.*;
import red.PokemonGame;

public class Haunter extends Poke
{
	public Haunter ()
	{
		super("Haunter", 93, PokemonGame.Ghost, PokemonGame.Poison, 45, 50, 45, 115, 55, 95);
		moveSetter();
		evolveSetter(94, 110);
		super.setEVYield(new int[]{0, 0, 0, 2, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Lick(), new ConfuseRay(), new NightShade(), new Hypnosis(), new DreamEater()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 29, 38}, {6, 20, 21, 24, 25, 29, 31, 32, 34, 36, 42, 44, 46, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
