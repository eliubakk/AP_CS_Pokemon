package pokemon;

import moves.*;
import red.PokemonGame;

public class Cubone extends Poke
{
	public Cubone()
	{
		super("Cubone", 104, PokemonGame.Ground, null, 50, 50, 95, 40, 50, 35);
		moveSetter();
		evolveSetter(105, 28);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new BoneClub(), new Growl(), new TailWhip(), new Headbutt(), new Leer(), new FocusEnergy(), new Thrash(), new Bonemerang(), new Rage()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 13, 18, 25, 31, 38, 43, 46}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 26, 27, 28, 31, 32, 33, 34, 38, 40, 44, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
