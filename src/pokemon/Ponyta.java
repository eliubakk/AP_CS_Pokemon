package pokemon;

import moves.*;
import red.PokemonGame;

public class Ponyta extends Poke
{
	public Ponyta()
	{
		super("Ponyta", 77, PokemonGame.Fire, null, 50, 85, 55, 65, 65, 90);
		moveSetter();
		evolveSetter(78, 40);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Ember(), new TailWhip(), new Stomp(), new Growl(), new FireSpin(), new TakeDown(), new Agility()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 30, 32, 35, 39, 43, 48}, {6, 7, 8, 9, 10, 20, 31, 32, 33, 34, 38, 39, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}