package pokemon;

import moves.*;
import red.PokemonGame;

public class Kadabra extends Poke
{
	public Kadabra()
	{
		super("Kadabra", 64, PokemonGame.Psychic, null, 40, 35, 30, 120, 70, 105);
		moveSetter();
		evolveSetter(65, 110);
		super.setEVYield(new int[]{0, 0, 0, 2, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Teleport(), new Kinesis(), new Confusion(), new Disable(), new Psybeam(), new Recover(), new Psychic(), new Reflect()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 16, 20, 27, 31, 38, 42}, {1, 5, 6, 8, 9, 10, 17, 18, 19, 20, 29, 30, 31, 32, 33, 34, 35, 40, 44, 45, 46, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}