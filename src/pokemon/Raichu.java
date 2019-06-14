package pokemon;

import moves.*;
import red.PokemonGame;

public class Raichu extends Poke
{
	public Raichu()
	{
		super("Raichu", 26, PokemonGame.Electric, null, 60, 90, 55, 90, 80, 110);
		moveSetter();
		//evolveSetter(26, 101);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 3});
	}

	private void moveSetter()
	{
		Move[] moves = {new ThunderShock(), new Growl(), new ThunderWave()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0}, {1, 5, 6, 8, 9, 10, 15, 16, 17, 19, 20, 24, 25, 31, 32, 33, 34, 39, 40, 44, 45, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}