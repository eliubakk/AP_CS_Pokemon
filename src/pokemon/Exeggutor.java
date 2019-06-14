package pokemon;

import moves.*;
import red.PokemonGame;

public class Exeggutor extends Poke
{
	public Exeggutor()
	{
		super("Exeggutor", 103, PokemonGame.Grass, PokemonGame.Psychic, 95, 95, 85, 125, 65, 55);
		moveSetter();
	//	evolveSetter(103, 106);
		super.setEVYield(new int[]{0, 0, 2, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Barrage(), new Hypnosis(), new Stomp()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 28}, {6, 9, 10, 15, 20, 29, 30, 31, 32, 33, 34, 36, 37, 39, 44, 46, 47, 50}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
