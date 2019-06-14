package pokemon;

import moves.*;
import red.PokemonGame;

public class Rattata extends Poke
{
	public Rattata()
	{
		super("Rattata", 19, PokemonGame.Normal, null, 30, 56, 35, 25, 35, 72);
		moveSetter();
		evolveSetter(20, 20);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new TailWhip(), new QuickAttack(), new HyperFang(), new FocusEnergy(), new SuperFang()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 7, 14, 23, 34}, {6, 8, 9, 10, 11, 12, 14, 20, 24, 25, 28, 31, 32, 34, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}