package red;
import items.Item;

import java.io.*;

import java.util.*;

import pokemon.*;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
import trainers.*;

import javax.swing.JFrame;

import moves.*;


public class PokemonGame 
{
	public static PokeType Bug = new PokeType("Bug");
	public static PokeType Grass = new PokeType("Grass");
	public static PokeType Fire = new PokeType("Fire");
	public static PokeType Water = new PokeType("Water");
	public static PokeType Electric = new PokeType("Electric");
	public static PokeType Dragon = new PokeType("Dragon");
	public static PokeType Poison = new PokeType("Poison");
	public static PokeType Ice = new PokeType("Ice");
	public static PokeType Fighting = new PokeType("Fighting");
	public static PokeType Psychic = new PokeType("Psychic");
	public static PokeType Ground = new PokeType("Ground");
	public static PokeType Rock = new PokeType("Rock");
	public static PokeType Normal = new PokeType("Normal");
	public static PokeType Flying = new PokeType("Flying");
	public static PokeType Ghost = new PokeType("Ghost");
	public static PokeType Dark = new PokeType("Dark");
	public static PokeType Steel = new PokeType("Steel");
	public static ArrayList<Move> MoveDirectory = new ArrayList<Move>();
	public static ArrayList<Poke> PokemonDirectory = new ArrayList<Poke>();
	public static ArrayList<Nature> NatureDirectory = new ArrayList<Nature>();
	public static ArrayList<Trainer> GymLeaderDirectory = new ArrayList<Trainer>();
	
	public static Nature Hardy = new Nature(1, 1, "Hardy");
	public static Nature Lonely = new Nature(1, 2, "Lonely");
	public static Nature Brave = new Nature(1, 3, "Brave");
	public static Nature Adamant = new Nature(1, 4, "Adamant");
	public static Nature Naughty = new Nature(1, 5, "Naughty");
	public static Nature Bold = new Nature(2, 1, "Bold");
	public static Nature Docile = new Nature(2, 2, "Docile");
	public static Nature Relaxed = new Nature(2, 3, "Relaxed");
	public static Nature Impish = new Nature(2, 4, "Impish");
	public static Nature Lax = new Nature(2, 5, "Lax");
	public static Nature Timid = new Nature(3, 1, "Timid");
	public static Nature Hasty = new Nature(3, 2, "Hasty");
	public static Nature Serious = new Nature(3, 3, "Serious");
	public static Nature Jolly = new Nature(3, 4, "Jolly");
	public static Nature Naive = new Nature(3, 5, "Naive");
	public static Nature Modest = new Nature(4, 1, "Modest");
	public static Nature Mild = new Nature(4, 2, "Mild");
	public static Nature Quiet = new Nature(4, 3, "Quiet");
	public static Nature Bashful = new Nature(4, 4, "Bashful");
	public static Nature Rash = new Nature(4, 5, "Rash");
	public static Nature Calm = new Nature(5, 1, "Calm");
	public static Nature Gentle = new Nature(5, 2, "Gentle");
	public static Nature Sassy = new Nature(5, 3, "Sassy");
	public static Nature Careful = new Nature(5, 4, "Careful");
	public static Nature Quirky = new Nature(5, 5, "Quirky");
	
	static MyFrame f;
	static Hero Erik;
	public static boolean blackedOut = false;
	
	public static void main(String[] args) throws IOException 
	{
		music();
		PokemonGame pg = new PokemonGame();
		
		
		
		
	}
	public static void music()
	{

        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            
            BGM = new AudioStream(new FileInputStream("BGMusic.wav"));
            AudioPlayer.player.start(BGM);
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);

        }
        catch(FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch(IOException error)
        {
            System.out.println(error.toString());
        }
        MGP.start(loop);
	}
	public PokemonGame()
	{
		//setPokemon();	
		setMoves();
		setNatures();
		setGym();
		setHeroTeam();
		battleGyms();
		
	}
	private void battleGyms()
	{       
		for(int i = 0; i < 8 && !blackedOut; i++)
		{
			try
			{
				f = new MyFrame(Erik, GymLeaderDirectory.get(i));
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			f.setVisible(true);
			Battle gymBattle = new Battle(Erik, GymLeaderDirectory.get(i));
			gymBattle.beginBattle();
			if(!blackedOut)
			{
				System.out.println("Good Job! " + Erik.name + " beat Gym Leader " + GymLeaderDirectory.get(i).name);
				Erik.HealTeam();
				System.out.println("Party has been completely healed. Next Battle!");
				f.dispose();
			}
		}
		
		System.out.println("Just joking, you have defeated all of the Gym Leaders, congrats!");
		
		
	}
	private void setHeroTeam()
	{
		
		Erik = new Hero("Erik");
		Erik.addPokemon(new CaughtPokemon(100, new Blastoise(), null));
		Erik.addPokemon(new CaughtPokemon(100, new Gengar(), null));
		Erik.addPokemon(new CaughtPokemon(100, new Fearow(), null));
		Erik.addPokemon(new CaughtPokemon(100, new Alakazam(), null));
		Erik.addPokemon(new CaughtPokemon(100, new Dragonite(), null));
		Erik.addPokemon(new CaughtPokemon(100, new Dugtrio(), null));
		Erik.getTeam().get(0).teachMove(new Surf());
		Erik.getTeam().get(0).teachMove(new MegaPunch());
		Erik.getTeam().get(0).teachMove(new Bite());
		Erik.getTeam().get(0).teachMove(new IceBeam());
		Erik.getTeam().get(1).teachMove(new Hypnosis());
		Erik.getTeam().get(1).teachMove(new DreamEater());
		Erik.getTeam().get(1).teachMove(new Thunderbolt());
		Erik.getTeam().get(1).teachMove(new NightShade());
		Erik.getTeam().get(2).teachMove(new Fly());
		Erik.getTeam().get(2).teachMove(new DrillPeck());
		Erik.getTeam().get(2).teachMove(new SwordsDance());
		Erik.getTeam().get(2).teachMove(new Toxic());
		Erik.getTeam().get(3).teachMove(new Psychic());
		Erik.getTeam().get(3).teachMove(new IcePunch());
		Erik.getTeam().get(3).teachMove(new HighJumpKick());
		Erik.getTeam().get(3).teachMove(new HyperBeam());
		Erik.getTeam().get(4).teachMove(new WingAttack());
		Erik.getTeam().get(4).teachMove(new Thunderbolt());
		Erik.getTeam().get(4).teachMove(new IceBeam());
		Erik.getTeam().get(4).teachMove(new Flamethrower());
		Erik.getTeam().get(5).teachMove(new Slash());
		Erik.getTeam().get(5).teachMove(new Earthquake());
		Erik.getTeam().get(5).teachMove(new Dig());
		Erik.getTeam().get(5).teachMove(new Explosion());
		ArrayList<Move> ary = new ArrayList<Move>();
		Move move[] = new Move[4];
		for(int i = 0; i < Erik.getTeam().size(); i++)
		{
			/*for(int i2 = 0; i2 < Erik.getTeam().get(i).pokemon.getLearnableMoves().length; i2++)
			{
				ary.add(Erik.getTeam().get(i).pokemon.getLearnableMoves()[i2]);
			}
			for(int i2 = 0; i2 < Erik.getTeam().get(i).pokemon.getMoveLevel()[1].length; i2++)
			{
				try{
					ary.add(MoveDirectory.get(Erik.getTeam().get(i).pokemon.getMoveLevel()[1][i2]));
				}catch(IndexOutOfBoundsException e)
				{
					int newIndex = Erik.getTeam().get(i).pokemon.getMoveLevel()[1][i2] % 100 + 50;
					ary.add(MoveDirectory.get(newIndex));
				}
			}
			for(int i2 = 0; i2 < 4; i2++)
			{
				int index = (int)(ary.size() * Math.random());
				move[i2] = ary.get(index);
				ary.remove(index);
			}
			Erik.getTeam().get(i).setMoves(move[0], move[1], move[2], move[3]);*/
			System.out.println("Moves of " + Erik.getTeam().get(i).pokemon.name + ": ");
			((CaughtPokemon) Erik.getTeam().get(i)).PrintMoves();
			ary.clear();
		}
		
	}
	private void setGym()
	{
		
		GymLeaderDirectory.add(new Trainer("Brock", new SeenPokemon(100, new Onix(), null).setMoves(new Bind(), new Toxic(), new Earthquake(), new RockSlide()), new SeenPokemon(100, new Graveler(), null).setMoves(new RockSlide(), new Dig(), new SelfDestruct(), new SeismicToss()), new SeenPokemon(100, new Cubone(), null).setMoves(new BodySlam(), new Fissure(), new BoneClub(), new Submission()), new SeenPokemon(100, new Vulpix(), null).setMoves(new Swift(), new QuickAttack(), new Flamethrower(), new FireSpin()), new SeenPokemon(100, new Omanyte(), null).setMoves(new HornAttack(), new SpikeCannon(), new IceBeam(), new Surf()), new SeenPokemon(100, new Kabuto(), null).setMoves(new Absorb(), new Slash(), new HydroPump(), new Blizzard())));
		GymLeaderDirectory.add(new Trainer("Misty", new SeenPokemon(100, new Starmie(), null).setMoves(new Thunder(), new Swift(), new BubbleBeam(), new ThunderWave()), new SeenPokemon(100, new Horsea(), null).setMoves(new Smokescreen(), new Surf(), new Toxic(), new IceBeam()), new SeenPokemon(100, new Psyduck(), null).setMoves(new Disable(), new Confusion(), new FurySwipes(), new BodySlam()), new SeenPokemon(100, new Blastoise(), null).setMoves(new HydroPump(), new Bite(), new Dig(), new SeismicToss()), new SeenPokemon(100, new Staryu(), null).setMoves(new Recover(), new Minimize(), new Thunderbolt(), new Psychic()), new SeenPokemon(100, new Seel(), null).setMoves(new Blizzard(), new Rest(), new TakeDown(), new Surf())));
		GymLeaderDirectory.add(new Trainer("Lt. Surge", new SeenPokemon(100, new Raichu(), null).setMoves(new Thunder(), new Surf(), new BodySlam(), new ThunderWave()), new SeenPokemon(100, new Voltorb(), null).setMoves(new Thunder(), new Explosion(), new SonicBoom(), new ThunderWave()), new SeenPokemon(100, new Electrode(), null).setMoves(new SonicBoom(), new SelfDestruct(), new Swift(), new Thunder()), new SeenPokemon(100, new Pikachu(), null).setMoves(new SeismicToss(), new Agility(), new DoubleTeam(), new Surf()), new SeenPokemon(100, new Magnemite(), null).setMoves(new Supersonic(), new Bide(), new Thunderbolt(), new Thunder()), new SeenPokemon(100, new Magneton(), null).setMoves(new Thunderbolt(), new TakeDown(), new Reflect(), new HyperBeam())));
		GymLeaderDirectory.add(new Trainer("Erika", new SeenPokemon(100, new Vileplume(), null).setMoves(new Acid(), new Absorb(), new SolarBeam(), new BodySlam()), new SeenPokemon(100, new Victreebel(), null).setMoves(new SleepPowder(), new Acid(), new RazorLeaf(), new Cut()), new SeenPokemon(100, new Tangela(), null).setMoves(new Bind(), new StunSpore(), new DoubleEdge(), new MegaDrain()), new SeenPokemon(100, new Gloom(), null).setMoves(new Acid(), new SleepPowder(), new PetalDance(), new MegaDrain()), new SeenPokemon(100, new Weepinbell(), null).setMoves(new Wrap(), new StunSpore(), new MegaDrain(), new RazorLeaf()), new SeenPokemon(100, new Exeggcute(), null).setMoves(new Hypnosis(), new LeechSeed(), new Toxic(), new Psychic())));
		GymLeaderDirectory.add(new Trainer("Koga", new SeenPokemon(100, new Venomoth(), null).setMoves(new MegaDrain(), new SleepPowder(), new Psybeam(), new DoubleEdge()), new SeenPokemon(100, new Muk(), null).setMoves(new Sludge(), new Minimize(), new PoisonGas(), new HyperBeam()), new SeenPokemon(100, new Weezing(), null).setMoves(new Sludge(), new Smokescreen(), new Thunderbolt(), new FireBlast()), new SeenPokemon(100, new Venonat(), null).setMoves(new StunSpore(), new SleepPowder(), new Psybeam(), new MegaDrain()), new SeenPokemon(100, new Nidorina(), null).setMoves(new DoubleKick(), new Thunder(), new IceBeam(), new Toxic()), new SeenPokemon(100, new Nidorino(), null).setMoves(new Toxic(), new FuryAttack(), new Thunderbolt(), new BubbleBeam())));
		GymLeaderDirectory.add(new Trainer("Sabrina", new SeenPokemon(100, new Alakazam(), null).setMoves(new Psybeam(), new Disable(), new Toxic(), new Dig()), new SeenPokemon(100, new Kadabra(), null).setMoves(new Disable(), new Psybeam(), new Reflect(), new SeismicToss()), new SeenPokemon(100, new MrMime(), null).setMoves(new DoubleSlap(), new Psychic(), new ThunderWave(), new SolarBeam()), new SeenPokemon(100, new Hypno(), null).setMoves(new Hypnosis(), new DreamEater(), new Confusion(), new MegaPunch()), new SeenPokemon(100, new Exeggutor(), null).setMoves(new LeechSeed(), new Toxic(), new MegaDrain(), new Psywave()), new SeenPokemon(100, new Jynx(), null).setMoves(new LovelyKiss(), new IcePunch(), new Psywave(), new BubbleBeam())));
		GymLeaderDirectory.add(new Trainer("Blaine", new SeenPokemon(100, new Rapidash(), null).setMoves(new Agility(), new Stomp(), new FireSpin(), new HornDrill()), new SeenPokemon(100, new Arcanine(), null).setMoves(new FireBlast(), new BodySlam(), new DragonRage(), new Dig()), new SeenPokemon(100, new Charizard(), null).setMoves(new Slash(), new Flamethrower(), new Fly(), new Earthquake()), new SeenPokemon(100, new Magmar(), null).setMoves(new BodySlam(), new Psychic(), new FirePunch(), new ConfuseRay()), new SeenPokemon(100, new Clefable(), null).setMoves(new Flamethrower(), new IceBeam(), new Thunderbolt(), new ThunderWave()), new SeenPokemon(100, new Kangaskhan(), null).setMoves(new Thunderbolt(), new FireBlast(), new Surf(), new Earthquake())));
		GymLeaderDirectory.add(new Trainer("Giovanni", new SeenPokemon(100, new Persian(), null).setMoves(new Toxic(), new Slash(), new Thunderbolt(), new BubbleBeam()), new SeenPokemon(100, new Dugtrio(), null).setMoves(new SandAttack(), new Slash(), new Dig(), new RockSlide()), new SeenPokemon(100, new Nidoqueen(), null).setMoves(new DoubleKick(), new Strength(), new Surf(), new Earthquake()), new SeenPokemon(100, new Nidoking(), null).setMoves(new HornDrill(), new Thunder(), new Blizzard(), new Toxic()), new SeenPokemon(100, new Rhydon(), null).setMoves(new FuryAttack(), new Earthquake(), new BodySlam(), new Fissure()), new SeenPokemon(100, new Tauros(), null).setMoves(new Thunder(), new FireBlast(), new Blizzard(), new Stomp())));
	}
	
	private void setNatures()
	{
		NatureDirectory.add(Adamant);
		NatureDirectory.add(Brave);
		NatureDirectory.add(Careful);
		NatureDirectory.add(Gentle);
		NatureDirectory.add(Lonely);
		NatureDirectory.add(Docile);
		NatureDirectory.add(Modest);
		NatureDirectory.add(Naive);
		NatureDirectory.add(Quiet);
		NatureDirectory.add(Relaxed);
		NatureDirectory.add(Serious);
		NatureDirectory.add(Bashful);
		NatureDirectory.add(Bold);
		NatureDirectory.add(Calm);
		NatureDirectory.add(Hardy);
		NatureDirectory.add(Hasty);
		NatureDirectory.add(Impish);
		NatureDirectory.add(Jolly);
		NatureDirectory.add(Lax);
		NatureDirectory.add(Mild);
		NatureDirectory.add(Naughty);
		NatureDirectory.add(Quirky);
		NatureDirectory.add(Rash);
		NatureDirectory.add(Sassy);
		NatureDirectory.add(Timid);
	}
	
	public void setMoves() 
	{
		MoveDirectory.add(new MegaPunch());
		MoveDirectory.add(new RazorWind());
		MoveDirectory.add(new SwordsDance());
		MoveDirectory.add(new Whirlwind());
		MoveDirectory.add(new MegaKick());	
		MoveDirectory.add(new Toxic());
		MoveDirectory.add(new HornDrill());
		MoveDirectory.add(new BodySlam());
		MoveDirectory.add(new TakeDown());
		MoveDirectory.add(new DoubleEdge());
		MoveDirectory.add(new BubbleBeam());
		MoveDirectory.add(new WaterGun());
		MoveDirectory.add(new IceBeam());
		MoveDirectory.add(new Blizzard());			
		MoveDirectory.add(new HyperBeam());
		MoveDirectory.add(new PayDay());
		MoveDirectory.add(new Submission());
		MoveDirectory.add(new Counter());
		MoveDirectory.add(new SeismicToss());
		MoveDirectory.add(new Rage());
		MoveDirectory.add(new MegaDrain());
		MoveDirectory.add(new SolarBeam());
		MoveDirectory.add(new DragonRage());
		MoveDirectory.add(new Thunderbolt());
		MoveDirectory.add(new Thunder());
		MoveDirectory.add(new Earthquake());
		MoveDirectory.add(new Fissure());
		MoveDirectory.add(new Dig());
		MoveDirectory.add(new Psychic());
		MoveDirectory.add(new Teleport());
		MoveDirectory.add(new Mimic());
		MoveDirectory.add(new DoubleTeam());
		MoveDirectory.add(new Reflect());
		MoveDirectory.add(new Bide());
		MoveDirectory.add(new Metronome());
		MoveDirectory.add(new SelfDestruct());
		MoveDirectory.add(new EggBomb());
		MoveDirectory.add(new FireBlast());
		MoveDirectory.add(new Swift());
		MoveDirectory.add(new SkullBash());
		MoveDirectory.add(new SoftBoiled());
		MoveDirectory.add(new DreamEater());
		MoveDirectory.add(new SkyAttack());
		MoveDirectory.add(new Rest());
		MoveDirectory.add(new ThunderWave());
		MoveDirectory.add(new Psywave());
		MoveDirectory.add(new Explosion());
		MoveDirectory.add(new RockSlide());
		MoveDirectory.add(new TriAttack());
		MoveDirectory.add(new Substitute());
		MoveDirectory.add(new Cut());
		MoveDirectory.add(new Fly());
		MoveDirectory.add(new Surf());
		MoveDirectory.add(new Strength());
		MoveDirectory.add(new Flash());
		/*MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Acid());
		MoveDirectory.add(new AcidArmor());
		MoveDirectory.add(new Bind());
		MoveDirectory.add(new BodySlam());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Acid());
		MoveDirectory.add(new AcidArmor());
		MoveDirectory.add(new Bind());
		MoveDirectory.add(new BodySlam());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());
		MoveDirectory.add(new Absorb());*/
	}
	public void setPokemon()
	{
		
	}
	

}
