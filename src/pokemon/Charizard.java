package pokemon;

import moves.*;
import red.PokemonGame;

public class Charizard extends Poke
{
	public Charizard()
	{
		super("Charizard", 6, PokemonGame.Fire, PokemonGame.Flying, 78, 84, 78, 109, 85, 100);
		moveSetter();
		//evolveSetter(36, 6);
		super.setEVYield(new int[]{0, 0, 0, 3, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Growl(), new Ember(), new Leer(), new Rage(), new Slash(), new Flamethrower(), new FireSpin()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 24, 36, 46, 55}, {1, 3, 5, 6, 8, 9, 10, 15, 17, 18, 19, 20, 23, 26, 27, 28, 31, 32, 33, 34, 38, 39, 40, 44, 50, 101, 102, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}