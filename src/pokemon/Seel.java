package pokemon;

import moves.*;
import red.PokemonGame;

public class Seel extends Poke
{
	public Seel()
	{
		super("Seel", 86, PokemonGame.Water, null, 65, 45, 55, 45, 70, 45);
		moveSetter();
		evolveSetter(87, 30);
		super.setEVYield(new int[]{0, 0, 0, 0, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Headbutt(), new Growl(), new AuroraBeam(), new Rest(), new TakeDown(), new IceBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 30, 35, 40, 45, 50}, {6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 20, 31, 32, 34, 40, 44, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}