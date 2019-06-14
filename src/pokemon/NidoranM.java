package pokemon;

import moves.*;
import red.PokemonGame;

public class NidoranM extends Poke
{
	public NidoranM()
	{
		super("Nidoran (M)", 32, PokemonGame.Poison, null, 46, 57, 40, 40, 40, 50);
		moveSetter();
		evolveSetter(33, 16);
		super.setEVYield(new int[]{0, 1, 0, 0, 0, 0});}

	private void moveSetter()
	{
		Move[] moves = {new Leer(), new Tackle(), new HornAttack(), new DoubleKick(), new PoisonSting(), new FocusEnergy(), new FuryAttack(), new HornDrill()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 8, 12, 17, 23, 30, 38}, {6, 7, 8, 9, 10, 14, 20, 24, 25, 31, 32, 33, 34, 40, 44, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}