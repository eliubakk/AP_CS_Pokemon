package pokemon;

import moves.*;
import red.PokemonGame;

public class Weepinbell extends Poke
{
	public Weepinbell()
	{
		super("Weepinbell", 70, PokemonGame.Grass, PokemonGame.Poison, 65, 90, 50, 85, 45, 55);
		moveSetter();
		evolveSetter(71, 105);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new VineWhip(), new Growth(), new Wrap(), new PoisonPowder(), new SleepPowder(), new StunSpore(), new Acid(), new RazorLeaf(), new Slam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 15, 18, 23, 29, 38, 49}, {3, 6, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}