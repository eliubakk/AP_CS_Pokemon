package pokemon;

import moves.*;
import red.PokemonGame;

public class Pidgeot extends Poke
{
	public Pidgeot()
	{
		super("Pidgeot", 18, PokemonGame.Normal, PokemonGame.Flying, 83, 80, 75, 70, 70, 101);
		moveSetter();
	//	evolveSetter(36, 18);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 3});
	}

	private void moveSetter()
	{
		Move[] moves = {new Gust(), new SandAttack(), new QuickAttack(), new Whirlwind(), new WingAttack(), new Agility(), new MirrorMove()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 21, 31, 44, 54}, {2, 4, 6, 9, 10, 20, 31, 32, 33, 34, 39, 43, 44, 50, 102}};
		super.setMoveLevel(moveLevel);
	}
	
	
}