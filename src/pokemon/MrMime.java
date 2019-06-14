package pokemon;

import moves.*;
import red.PokemonGame;

public class MrMime extends Poke
{
	public MrMime()
	{
		super("Mr. Mime", 122, PokemonGame.Psychic, null, 40, 45, 65, 100, 120, 90);
		moveSetter();
		//evolveSetter(121, 105);
		super.setEVYield(new int[]{0, 0, 0, 0, 2, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Barrier(), new Confusion(), new LightScreen(), new DoubleSlap(), new Meditate(), new Substitute()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 15, 23, 31, 39, 47}, {1, 5, 6, 8, 9, 10, 15, 17, 18, 19, 20, 22, 24, 25, 29, 30, 31, 32, 33, 34, 35, 40, 44, 45, 46, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
