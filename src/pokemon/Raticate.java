package pokemon;

import moves.*;
import red.PokemonGame;

public class Raticate extends Poke
{
	public Raticate()
	{
		super("Raticate", 20, PokemonGame.Normal, null, 55, 81, 60, 50, 70, 97);
		moveSetter();
		//evolveSetter(20, 20);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new TailWhip(), new QuickAttack(), new HyperFang(), new FocusEnergy(), new SuperFang()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 14, 27, 41}, {6, 8, 9, 10, 11, 12, 14, 20, 24, 25, 28, 31, 32, 34, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}