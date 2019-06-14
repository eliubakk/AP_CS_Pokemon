package pokemon;

import moves.*;
import red.PokemonGame;

public class Muk extends Poke
{
	public Muk()
	{
		super("Muk", 89, PokemonGame.Poison, null, 105, 105, 75, 65, 100, 50);
		moveSetter();
		//evolveSetter(89, 38);
		super.setEVYield(new int[]{1, 1, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Pound(), new Disable(), new PoisonGas(), new Minimize(), new Sludge(), new Harden(), new Screech(), new AcidArmor()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 33, 37, 45, 53, 60}, {6, 8, 15, 20, 21, 24, 31, 32, 34, 36, 38, 44, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}