package pokemon;

import moves.*;
import red.PokemonGame;

public class Gengar extends Poke
{
	public Gengar()
	{
		super("Gengar", 94, PokemonGame.Ghost, PokemonGame.Poison, 60, 65, 60, 130, 75, 110);
		moveSetter();
	//	evolveSetter(93, 110);
		super.setEVYield(new int[]{0, 0, 0, 3, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Lick(), new ConfuseRay(), new NightShade(), new Hypnosis(), new DreamEater()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 29, 38}, {1, 5, 6, 8, 9, 10, 15, 17, 18, 19, 20, 21, 24, 25, 29, 31, 32, 34, 35, 36, 42, 44, 46, 47, 50, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
