package pokemon;

import moves.*;
import red.PokemonGame;

public class NidoranF extends Poke
{
	public NidoranF()
	{
		super("Nidoran (F)", 29, PokemonGame.Poison, null, 55, 47, 52, 40, 40, 41);
		moveSetter();
		evolveSetter(30, 16);
		super.setEVYield(new int[]{1, 0, 0, 0, 0, 0});}

	private void moveSetter()
	{
		Move[] moves = {new Growl(), new Tackle(), new Scratch(), new DoubleKick(), new PoisonSting(), new TailWhip(), new Bite(), new FurySwipes()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 8, 12, 17, 23, 30, 38}, {6, 8, 9, 10, 14, 20, 24, 25, 31, 32, 33, 34, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}