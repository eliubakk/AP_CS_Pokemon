package pokemon;

import moves.*;
import red.PokemonGame;

public class Onix extends Poke
{
	public Onix()
	{
		super("Onix", 95, PokemonGame.Rock, PokemonGame.Ground, 35, 45, 160, 30, 45, 70);
		moveSetter();
		//evolveSetter(93, 110);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Screech(), new Bind(), new RockThrow(), new Rage(), new Slam(), new Harden()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 15, 19, 25, 33, 43}, {6, 8, 9, 10, 20, 26, 27, 28, 31, 32, 34, 36, 40, 44, 47, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
