package pokemon;

import moves.*;
import red.PokemonGame;

public class Alakazam extends Poke
{
	public Alakazam()
	{
		super("Alakazam", 65, PokemonGame.Psychic, null, 55, 50, 45, 135, 95, 120);
		moveSetter();
		//evolveSetter(65, 16);
		super.setEVYield(new int[]{0, 0, 0, 3, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Teleport(), new Kinesis(), new Confusion(), new Disable(), new Psybeam(), new Recover(), new Psychic(), new Reflect()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 16, 20, 27, 31, 38, 42}, {1, 5, 6, 8, 9, 10, 15, 17, 18, 19, 20, 29, 30, 31, 32, 33, 34, 35, 40, 44, 45, 46, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}