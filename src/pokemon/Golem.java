package pokemon;

import moves.*;
import red.PokemonGame;

public class Golem extends Poke
{
	public Golem()
	{
		super("Golem", 76, PokemonGame.Rock, PokemonGame.Ground, 80, 110, 130, 55, 65, 45);
		moveSetter();
		//evolveSetter(76, 110);
		super.setEVYield(new int[]{0, 0, 3, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new DefenseCurl(), new RockThrow(), new SelfDestruct(), new Harden(), new Earthquake(), new Explosion()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 16, 21, 29, 36, 43}, {1, 6, 8, 9, 10, 15, 17, 18, 19, 20, 26, 27, 28, 31, 32, 34, 35, 36, 38, 44, 47, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}