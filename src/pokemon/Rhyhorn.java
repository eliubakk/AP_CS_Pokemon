package pokemon;

import moves.*;
import red.PokemonGame;

public class Rhyhorn extends Poke
{
	public Rhyhorn()
	{
		super("Rhyhorn", 111, PokemonGame.Ground, PokemonGame.Rock, 80, 85, 95, 30, 30, 25);
		moveSetter();
		evolveSetter(112, 42);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new HornAttack(), new Stomp(), new TailWhip(), new FuryAttack(), new HornDrill(), new Leer(), new TakeDown()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 30, 35, 40, 45, 50, 55}, {6, 7, 8, 9, 10, 20, 24, 25, 26, 27, 28, 31, 32, 34, 38, 44, 47, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
