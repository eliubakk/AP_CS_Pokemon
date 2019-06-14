package pokemon;

import moves.*;
import red.PokemonGame;

public class Butterfree extends Poke
{
	public Butterfree()
	{
		super("Butterfree", 10, PokemonGame.Bug, PokemonGame.Flying, 60, 45, 50, 80, 80, 70);
		moveSetter();
		//evolveSetter(7, 11);
		super.setEVYield(new int[]{0, 0, 0, 2, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Confusion(), new PoisonPowder(), new StunSpore(), new Supersonic(), new Whirlwind(), new Gust(), new Psybeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 13, 14, 15, 18, 23, 28, 34}, {2, 4, 6, 9, 10, 15, 20, 21, 22, 29, 30, 31, 32, 33, 34, 39, 44, 46, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
