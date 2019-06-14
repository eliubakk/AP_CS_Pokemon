package pokemon;

import moves.*;
import red.PokemonGame;

public class Magneton extends Poke
{
	public Magneton()
	{
		super("Magneton", 82, PokemonGame.Electric, PokemonGame.Steel, 50, 60, 95, 120, 70, 70);
		moveSetter();
		//evolveSetter(82, 30);
		super.setEVYield(new int[]{0, 0, 0, 2, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new SonicBoom(), new ThunderShock(), new Supersonic(), new ThunderWave(), new Swift(), new Screech()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 29, 38, 46, 54}, {6, 9, 10, 15, 20, 24, 25, 30, 31, 32, 33, 34, 39, 44, 45, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}