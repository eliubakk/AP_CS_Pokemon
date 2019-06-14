package pokemon;

import moves.*;
import red.PokemonGame;

public class Bellsprout extends Poke
{
	public Bellsprout()
	{
		super("Bellsprout", 69, PokemonGame.Grass, PokemonGame.Poison, 50, 75, 35, 70, 30, 40);
		moveSetter();
		evolveSetter(70, 21);
		super.setEVYield(new int[]{0, 1, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new VineWhip(), new Growth(), new Wrap(), new PoisonPowder(), new SleepPowder(), new StunSpore(), new Acid(), new RazorLeaf(), new Slam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 13, 15, 18, 21, 26, 33, 42}, {3, 6, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 48, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}