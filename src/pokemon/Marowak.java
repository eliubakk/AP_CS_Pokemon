package pokemon;

import moves.*;
import red.PokemonGame;

public class Marowak extends Poke
{
	public Marowak()
	{
		super("Marowak", 105, PokemonGame.Ground, null, 60, 80, 110, 50, 80, 45);
		moveSetter();
		//evolveSetter(105, 28);
		super.setEVYield(new int[]{0, 0, 2, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new BoneClub(), new TailWhip(), new Headbutt(), new Leer(), new FocusEnergy(), new Thrash(), new Bonemerang(), new Rage()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 18, 25, 33, 41, 48, 55}, {1, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 26, 27, 28, 31, 32, 33, 34, 38, 40, 44, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
