package pokemon;

import moves.*;
import red.PokemonGame;

public class Dragonite extends Poke
{
	public Dragonite()
	{
		super("Dragonite", 149, PokemonGame.Dragon, PokemonGame.Flying, 91, 134, 95, 100, 100, 80);
		moveSetter();
		//evolveSetter(7, 11);
		super.setEVYield(new int[]{0, 3, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Wrap(), new Leer(), new ThunderWave(), new Agility(), new Slam(), new DragonRage(), new HyperBeam()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 0, 35, 45, 60}, {2, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 20, 23, 24, 25, 29, 30, 31, 32, 33, 34, 38, 39, 44, 45, 50, 101, 103, 104}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
