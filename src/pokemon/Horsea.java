package pokemon;

import moves.*;
import red.PokemonGame;

public class Horsea extends Poke
{
	public Horsea()
	{
		super("Horsea", 116, PokemonGame.Water, null, 30, 40, 70, 70, 25, 60);
		moveSetter();
		evolveSetter(117, 32);
		super.setEVYield(new int[]{0, 0, 0, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new BubbleBeam(), new Smokescreen(), new Leer(), new WaterGun(), new Agility(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 19, 24, 30, 37, 45}, {6, 9, 10, 11, 12, 13, 14, 20, 31, 32, 34, 39, 40, 44, 50, 103}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
