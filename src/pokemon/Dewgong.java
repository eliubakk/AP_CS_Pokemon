package pokemon;

import moves.*;
import red.PokemonGame;

public class Dewgong extends Poke
{
	public Dewgong()
	{
		super("Dewgong", 87, PokemonGame.Water, PokemonGame.Ice, 90, 70, 80, 70, 95, 70);
		moveSetter();
		//evolveSetter(82, 30);
		super.setEVYield(new int[]{0, 0, 0, 0, 2, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Headbutt(), new Growl(), new AuroraBeam(), new Rest(), new TakeDown(), new IceBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 44, 50, 56}, {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 20, 31, 32, 34, 40, 44, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}