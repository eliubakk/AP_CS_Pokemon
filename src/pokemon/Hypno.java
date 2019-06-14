package pokemon;

import moves.*;
import red.PokemonGame;

public class Hypno extends Poke
{
	public Hypno()
	{
		super("Hypno", 97, PokemonGame.Psychic, null, 85, 73, 70, 73, 115, 67);
		moveSetter();
		//evolveSetter(97, 26);
		super.setEVYield(new int[]{0, 0, 0, 0, 2, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Pound(), new Hypnosis(), new Disable(), new Confusion(), new Headbutt(), new PoisonGas(), new Psychic(), new Meditate()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 24, 33, 37, 43}, {1, 5, 6, 8, 9, 10, 15, 17, 18, 19, 20, 29, 30, 31, 32, 33, 34, 35, 40, 44, 46, 49, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
