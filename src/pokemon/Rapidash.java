package pokemon;

import moves.*;
import red.PokemonGame;

public class Rapidash extends Poke
{
	public Rapidash()
	{
		super("Rapidash", 78, PokemonGame.Fire, null, 50, 855, 55, 65, 65, 90);
		moveSetter();
		//evolveSetter(78, 40);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new Ember(), new TailWhip(), new Stomp(), new Growl(), new FireSpin(), new TakeDown(), new Agility()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 39, 47, 55}, {6, 7, 8, 9, 10, 15, 20, 31, 32, 33, 34, 38, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}