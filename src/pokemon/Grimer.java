package pokemon;

import moves.*;
import red.PokemonGame;

public class Grimer extends Poke
{
	public Grimer()
	{
		super("Grimer", 88, PokemonGame.Poison, null, 80, 80, 50, 40, 50, 25);
		moveSetter();
		evolveSetter(89, 38);
		super.setEVYield(new int[]{1, 0, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Pound(), new Disable(), new PoisonGas(), new Minimize(), new Sludge(), new Harden(), new Screech(), new AcidArmor()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 30, 37, 38, 42, 48, 52}, {6, 8, 20, 21, 31, 32, 34, 36, 38, 44, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}