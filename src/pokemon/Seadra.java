package pokemon;

import moves.*;
import red.PokemonGame;

public class Seadra extends Poke
{
	public Seadra()
	{
		super("Seadra", 117, PokemonGame.Water, null, 55, 65, 95, 95, 45, 85);
		moveSetter();
		//evolveSetter(117, 32);
		super.setEVYield(new int[]{0, 0, 1, 1, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new BubbleBeam(), new Smokescreen(), new Leer(), new WaterGun(), new Agility(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 24, 30, 41, 52}, {6, 9, 10, 11, 12, 13, 14, 15, 20, 31, 32, 34, 39, 40, 44, 50, 103}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
