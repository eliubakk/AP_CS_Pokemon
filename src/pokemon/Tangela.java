package pokemon;

import moves.*;
import red.PokemonGame;

public class Tangela extends Poke
{
	public Tangela()
	{
		super("Tangela", 114, PokemonGame.Grass, null, 65, 55, 115, 100, 40, 60);
		moveSetter();
		//evolveSetter(112, 42);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Constrict(), new Bind(), new Absorb(), new VineWhip(), new PoisonPowder(), new StunSpore(), new SleepPowder(), new Slam(), new Growth()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 24, 27, 29, 32, 36, 39, 45, 48}, {3, 6, 8, 9, 10, 15, 20, 21, 22, 31, 32, 34, 40, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
