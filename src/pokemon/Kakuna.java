package pokemon;

import moves.*;
import red.PokemonGame;

public class Kakuna extends Poke
{
	public Kakuna()
	{
		super("Kakuna", 14, PokemonGame.Bug, PokemonGame.Poison, 45, 25, 50, 25, 25, 35);
		moveSetter();
		evolveSetter(10, 15);
		super.setEVYield(new int[]{0, 0, 2, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Harden()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0}, {}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
