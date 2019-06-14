package pokemon;

import moves.*;
import red.PokemonGame;



public class Bulbasaur extends Poke
{
	
	public Bulbasaur()
	{
		super("Bulbasaur", 1, PokemonGame.Grass, PokemonGame.Poison, 45, 49, 49, 65, 65, 45);
		moveSetter();
		super.evolveSetter(16, 2);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Growl(),/* new LeechSeed(),*/ new VineWhip(), new PoisonPowder(),/* new RazorLeaf(),*/ new Growth(), new SleepPowder(), new SolarBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 7, 13, 20, 27, 34, 41, 48}, {3, 6, 8, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}

