package pokemon;

import moves.*;
import red.PokemonGame;

public class Jynx extends Poke
{
	public Jynx()
	{
		super("Jynx", 124, PokemonGame.Ice, PokemonGame.Psychic, 65, 50, 35, 115, 95, 95);
		moveSetter();
	//	evolveSetter(121, 105);
		super.setEVYield(new int[]{0, 0, 0, 2, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Pound(), new LovelyKiss(), new Lick(), new DoubleSlap(), new IcePunch(), new BodySlam(), new Thrash(), new Blizzard()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 18, 23, 31, 39, 47, 58}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 29, 30, 31, 32, 33, 34, 35, 40, 44, 46, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
