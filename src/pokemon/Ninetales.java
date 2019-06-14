package pokemon;

import moves.*;
import red.PokemonGame;

public class Ninetales extends Poke
{
	public Ninetales()
	{
		super("Ninetales", 38, PokemonGame.Fire, null, 73, 76, 75, 81, 100, 100);
		moveSetter();
		//evolveSetter(38, 103);
		super.setEVYield(new int[]{0, 0, 0, 0, 1, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Ember(), new TailWhip(), new QuickAttack(), new Roar()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0}, {6, 8, 9, 10, 20, 28, 31, 32, 33, 34, 38, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
