package pokemon;
import moves.*;
import red.PokemonGame;

public class Beedrill extends Poke
{
	public Beedrill()
	{
		super("Beedrill", 15, PokemonGame.Bug, PokemonGame.Poison, 65, 80, 40, 45, 80, 75);
		moveSetter();
		//evolveSetter(10, 12);
		super.setEVYield(new int[]{0, 2, 0, 0, 1, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new FuryAttack(), new FocusEnergy(), new Twineedle(), new Rage(), new PinMissile(), new Agility()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{16, 2025, 30, 35}, {3, 6, 9, 10, 15, 20, 21, 31, 32, 33, 34, 39, 40, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
