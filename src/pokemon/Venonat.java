package pokemon;

import moves.*;
import red.PokemonGame;

public class Venonat extends Poke
{
	public Venonat()
	{
		super("Venonat", 48, PokemonGame.Bug, PokemonGame.Poison, 60, 55, 50, 40, 55, 45);
		moveSetter();
		evolveSetter(49, 31);
		super.setEVYield(new int[]{0, 0, 0, 0, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Disable(), new Supersonic(), new Confusion(), new PoisonPowder(), new LeechLife(), new StunSpore(), new Psybeam(), new SleepPowder(), new Psychic()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 11, 19, 22, 27, 30, 35, 38, 43}, {6, 9, 10, 20, 21, 22, 29, 31, 32, 33, 34, 44, 46, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}