package pokemon;

import moves.*;
import red.PokemonGame;

public class Golbat extends Poke
{
	public Golbat()
	{
		super("Golbat", 42, PokemonGame.Poison, PokemonGame.Flying, 75, 80, 70, 65, 75, 90);
		moveSetter();
	//	evolveSetter(42, 102);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new LeechLife(), new Screech(), new Bite(), new Supersonic(), new ConfuseRay(), new WingAttack(), new Haze()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 10, 21, 32, 43}, {2, 4, 6, 9, 10, 15, 20, 21, 31, 32, 34, 39, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}