package pokemon;

import moves.*;
import red.PokemonGame;

public class Omastar extends Poke
{
	public Omastar()
	{
		super("Omastar", 139, PokemonGame.Rock, PokemonGame.Water, 70, 60, 125, 115, 70, 55);
		moveSetter();
		//evolveSetter(139, 40);
		super.setEVYield(new int[]{0, 0, 2, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new WaterGun(), new Withdraw(), new HornAttack(), new Leer(), new SpikeCannon(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 39, 44, 49}, {6, 7, 8, 9, 10, 11, 12, 13, 14, 17, 19, 20, 30, 31, 32, 33, 34, 44, 50, 103}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
