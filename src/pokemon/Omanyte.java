package pokemon;

import moves.*;
import red.PokemonGame;

public class Omanyte extends Poke
{
	public Omanyte()
	{
		super("Omanyte", 138, PokemonGame.Rock, PokemonGame.Water, 35, 40, 100, 90, 55, 35);
		moveSetter();
		evolveSetter(139, 40);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new WaterGun(), new Withdraw(), new HornAttack(), new Leer(), new SpikeCannon(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 34, 39, 46, 53}, {6, 8, 9, 10, 11, 12, 13, 14, 20, 30, 31, 32, 33, 34, 44, 50, 103}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
