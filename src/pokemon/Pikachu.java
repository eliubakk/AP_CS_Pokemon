package pokemon;

import moves.*;
import red.PokemonGame;

public class Pikachu extends Poke
{
	public Pikachu()
	{
		super("Pikachu", 25, PokemonGame.Electric, null, 35, 55, 30, 50, 40, 90);
		moveSetter();
		evolveSetter(26, 101);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new ThunderShock(), new Growl(), new TailWhip(), new ThunderWave(), new QuickAttack(), new DoubleTeam(), new Slam(), new Thunderbolt(), new Agility(), new Thunder(), new LightScreen()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 6, 8, 11, 15, 20, 26, 33, 41, 50}, {1, 5, 6, 8, 9, 10, 16, 17, 19, 20, 24, 25, 31, 32, 33, 34, 39, 40, 44, 45, 50, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}