package pokemon;

import moves.*;
import red.PokemonGame;

public class Weezing extends Poke
{
	public Weezing()
	{
		super("Weezing", 110, PokemonGame.Poison, null, 65, 90, 120, 85, 70, 60);
		moveSetter();
		//evolveSetter(110, 35);
		super.setEVYield(new int[]{0, 0, 2, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new Smog(), new Sludge(), new Smokescreen(), new SelfDestruct(), new Haze(), new Explosion()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 39, 43, 49, 53}, {6, 15, 20, 24, 25, 31, 32, 34, 36, 38, 44, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
