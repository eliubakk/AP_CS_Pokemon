package pokemon;

import moves.*;
import red.PokemonGame;

public class Nidorina extends Poke
{
	public Nidorina()
	{
		super("Nidorina", 30, PokemonGame.Poison, null, 70, 62, 67, 55, 55, 56);
		moveSetter();
		evolveSetter(31, 102);
		super.setEVYield(new int[]{2, 0, 0, 0, 0, 0});}

	private void moveSetter()
	{
		Move[] moves = {new Growl(), new Tackle(), new Scratch(), new DoubleKick(), new PoisonSting(), new TailWhip(), new Bite(), new FurySwipes()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 12, 19, 27, 36, 46}, {6, 7, 8, 9, 10, 11, 12, 13, 14, 20, 24, 25, 31, 32, 33, 34, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}