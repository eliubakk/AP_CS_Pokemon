package pokemon;

import moves.*;
import red.PokemonGame;

public class Zubat extends Poke
{
	public Zubat()
	{
		super("Zubat", 41, PokemonGame.Poison, PokemonGame.Flying, 40, 45, 35, 30, 40, 55);
		moveSetter();
		evolveSetter(42, 102);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new LeechLife(), new Supersonic(), new Bite(), new ConfuseRay(), new WingAttack(), new Haze()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 10, 15, 21, 28, 36}, {2, 4, 6, 9, 10, 20, 21, 31, 32, 34, 39, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
