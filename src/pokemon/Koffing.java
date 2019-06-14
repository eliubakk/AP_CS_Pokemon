package pokemon;

import moves.*;
import red.PokemonGame;

public class Koffing extends Poke
{
	public Koffing()
	{
		super("Koffing", 109, PokemonGame.Poison, null, 40, 65, 95, 60, 45, 35);
		moveSetter();
		evolveSetter(110, 35);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Smog(), new Sludge(), new Smokescreen(), new SelfDestruct(), new Haze(), new Explosion()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 32, 37, 40, 45, 48}, {6, 20, 24, 25, 31, 32, 34, 38, 44, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
