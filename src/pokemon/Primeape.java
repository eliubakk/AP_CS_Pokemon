package pokemon;

import moves.*;
import red.PokemonGame;

public class Primeape extends Poke
{
	public Primeape()
	{
		super("Primeape", 57, PokemonGame.Fighting, null, 65, 105, 60, 60, 70, 95);
		moveSetter();
	//	evolveSetter(57, 28);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Leer(), new LowKick(), new KarateChop(), new FurySwipes(), new FocusEnergy(), new SeismicToss(), new Rage(), new Screech(), new Thrash()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 21, 27, 28, 37, 45, 46}, {1, 5, 6, 8, 9, 10, 15, 16, 17, 18, 19, 20, 24, 25, 28, 31, 32, 34, 35, 39, 40, 44, 48, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}