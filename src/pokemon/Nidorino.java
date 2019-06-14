package pokemon;

import moves.*;
import red.PokemonGame;

public class Nidorino extends Poke
{
	public Nidorino()
	{
		super("Nidorino", 33, PokemonGame.Poison, null, 61, 72, 57, 55, 55, 65);
		moveSetter();
		evolveSetter(34, 102);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});}

	private void moveSetter()
	{
		Move[] moves = {new Leer(), new Tackle(), new HornAttack(), new DoubleKick(), new PoisonSting(), new FocusEnergy(), new FuryAttack(), new HornDrill()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 12, 19, 27, 36, 46}, {6, 7, 8, 9, 10, 11, 12, 13, 14, 20, 24, 25, 31, 32, 33, 34, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}