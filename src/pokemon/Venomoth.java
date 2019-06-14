package pokemon;

import moves.*;
import red.PokemonGame;

public class Venomoth extends Poke
{
	public Venomoth()
	{
		super("Venomoth", 48, PokemonGame.Bug, PokemonGame.Poison, 70, 65, 60, 90, 75, 90);
		moveSetter();
		//evolveSetter(49, 31);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Disable(), new Supersonic(), new Confusion(), new PoisonPowder(), new LeechLife(), new StunSpore(), new Psybeam(), new SleepPowder(), new Psychic()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 22, 27, 30, 38, 43, 50}, {2, 4, 6, 9, 10, 15, 20, 21, 22, 29, 30, 31, 32, 33, 34, 39, 44, 46, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}