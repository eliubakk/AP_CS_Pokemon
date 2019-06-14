package pokemon;

import moves.*;
import red.PokemonGame;

public class Charmander extends Poke
{
	public Charmander()
	{
		super("Charmander", 4, PokemonGame.Fire, null, 39, 52, 43, 60, 50, 65);
		moveSetter();
		evolveSetter(16, 5);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Growl(), new Ember(), new Leer(), new Rage(), new Slash(), new Flamethrower(), new FireSpin()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 9, 15, 22, 30, 38, 46}, {1, 3, 5, 6, 8, 9, 10, 17, 18, 19, 20, 23, 28, 31, 32, 33, 34, 38, 39, 40, 44, 50, 101, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}