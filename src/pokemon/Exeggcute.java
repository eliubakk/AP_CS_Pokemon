package pokemon;

import moves.*;
import red.PokemonGame;

public class Exeggcute extends Poke
{
	public Exeggcute()
	{
		super("Exeggcute", 102, PokemonGame.Grass, PokemonGame.Psychic, 60, 40, 80, 60, 45, 40);
		moveSetter();
		evolveSetter(103, 106);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Barrage(), new Hypnosis(), new Reflect(), new LeechSeed(), new StunSpore(), new PoisonPowder(), new SolarBeam(), new SleepPowder()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 25, 28, 32, 37, 42, 48}, {6, 9, 10, 20, 29, 30, 31, 32, 33, 34, 36, 37, 39, 44, 46, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
