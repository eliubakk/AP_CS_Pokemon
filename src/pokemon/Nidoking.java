package pokemon;

import moves.*;
import red.PokemonGame;

public class Nidoking extends Poke
{
	public Nidoking()
	{
		super("Nidoking", 34, PokemonGame.Poison, PokemonGame.Ground, 81, 92, 77, 85, 75, 85);
		moveSetter();
		//evolveSetter(31, 102);
		super.setEVYield(new int[]{0, 3, 0, 0, 0, 0});}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new HornAttack(), new PoisonSting(), new Thrash(), new DoubleKick()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 12}, {1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 24, 25, 26, 27, 31, 32, 33, 34, 38, 40, 44, 48, 50, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
