package pokemon;

import moves.*;
import red.PokemonGame;

public class Drowzee extends Poke
{
	public Drowzee()
	{
		super("Drowzee", 96, PokemonGame.Psychic, null, 60, 48, 45, 43, 90, 42);
		moveSetter();
		evolveSetter(97, 26);
		super.setEVYield(new int[]{0, 0, 0, 0, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Pound(), new Hypnosis(), new Disable(), new Confusion(), new Headbutt(), new PoisonGas(), new Psychic(), new Meditate()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 12, 17, 24, 29, 32, 37}, {1, 5, 6, 8, 9, 10, 17, 18, 19, 20, 29, 30, 31, 32, 33, 34, 35, 40, 44, 46, 49, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
