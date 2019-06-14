package pokemon;

import moves.*;
import red.PokemonGame;

public class Geodude extends Poke
{
	public Geodude()
	{
		super("Geodude", 74, PokemonGame.Rock, PokemonGame.Ground, 40, 80, 100, 30, 30, 20);
		moveSetter();
		evolveSetter(75, 25);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new DefenseCurl(), new RockThrow(), new SelfDestruct(), new Harden(), new Earthquake(), new Explosion()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 11, 16, 21, 26, 31, 36}, {1, 6, 8, 9, 10, 17, 18, 19, 20, 26, 27, 28, 31, 32, 34, 35, 36, 38, 44, 47, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}