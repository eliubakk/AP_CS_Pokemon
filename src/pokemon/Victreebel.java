package pokemon;

import moves.*;
import red.PokemonGame;

public class Victreebel extends Poke
{
	public Victreebel()
	{
		super("Victreebel", 71, PokemonGame.Grass, PokemonGame.Poison, 80, 105, 65, 100, 60, 70);
		moveSetter();
		//evolveSetter(71, 105);
		super.setEVYield(new int[]{0, 3, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = { new SleepPowder(), new StunSpore(), new Acid(), new RazorLeaf(), new Wrap(), new PoisonPowder(), new Slam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 13, 15, 18}, {3, 6, 8, 9, 10, 15, 20, 21, 22, 31, 32, 33, 34, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}