package pokemon;

import moves.*;
import red.PokemonGame;

public class Magnemite extends Poke
{
	public Magnemite()
	{
		super("Magnemite", 81, PokemonGame.Electric, PokemonGame.Steel, 25, 35, 70, 95, 55, 45);
		moveSetter();
		evolveSetter(82, 30);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new SonicBoom(), new ThunderShock(), new Supersonic(), new ThunderWave(), new Swift(), new Screech()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 21, 25, 29, 35, 41, 47}, {6, 9, 10, 20, 24, 25, 30, 31, 32, 33, 34, 39, 44, 45, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}