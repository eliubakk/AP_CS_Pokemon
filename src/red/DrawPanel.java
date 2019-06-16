package red;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;

import javax.imageio.*;
import javax.swing.*;

import trainers.*;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel implements ActionListener
{
	BufferedImage FrontSprites = null, BackSprites = null, background = null, HealthBar = null;
	Graphics2D g2d;
	Hero h;
	Trainer t;
	private final static int n = 64;
	private final int PSize = 4;
	JButton b[][] = new JButton[2][2];
	JLabel l[][] = new JLabel[2][2];
	String s[][] = new String[2][2];
	boolean draw = true;
	int chosenNumber = -2; 
	private JComboBox c = new JComboBox();
	private JTextField txt = new JTextField(15);
	private int count = 0;
	private String[] description = { "Ebullient", "Obtuse", "Recalcitrant",
		      "Brilliant", "Somnescent", "Timorous", "Florid", "Putrescent" };
	private JButton bt = new JButton("Add items");
	
	public DrawPanel(Hero h, Trainer t) throws IOException
	{
		//background = ImageIO.read(new File("battle_background.png"));
		background = ImageIO.read(new File("img/PlatinumBattleBackground.png"));
		FrontSprites = ImageIO.read(new File("img/firered-leafgreen.png"));
		BackSprites = ImageIO.read(new File("img/firered-leafgreen-back.png"));
		HealthBar = ImageIO.read(new File("img/HealthBar.png"));
		this.h = h;
		this.t = t;
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 2; j++)
			{
				b[i][j] = new JButton();
				b[i][j].setActionCommand(Integer.toString(i * 2 + j));
				b[i][j].addActionListener(this);
				l[i][j] = new JLabel();
				s[i][j] = null;
			}
	}
	
	private void doDrawing(Graphics g)
	{
		
		removeAll();
		g2d = (Graphics2D) g;
		drawSprites(g2d);
		drawTextBoxes(g2d);
		/*if(!draw)
			for(int i = 0; i < 2; i++)
				for(int j = 0; j < 2; j++)
					s[i][j] = null;
		for (int i = 0; i < 4; i++)
		      c.addItem(description[count]);
		    txt.setEditable(false);
		    bt.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        if (count < description.length)
		          c.addItem(description[count]);
		      }
		    });
		c.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        txt.setText("index: " + c.getSelectedIndex() + "   "
		            + ((JComboBox) e.getSource()).getSelectedItem());
		      }
		    });
		Container cp = getRootPane();*/
	 //   cp.setLayout(new FlowLayout());
	//    cp.add(c);
	//    cp.add(bt);
	//    cp.add(txt);
		
		//if(draw)
			for(int i = 0; i < 2; i++)
				for(int i2 = 0; i2 < 2; i2++)
				{
					if(s[i][i2] == null)
					{
						b[i][i2] = new JButton();
						b[i][i2].setActionCommand(Integer.toString(i * 2 + i2));
						b[i][i2].addActionListener(this);
						add(b[i][i2]);
						b[i][i2].setEnabled(false);
						b[i][i2].setContentAreaFilled(false);
						b[i][i2].setBorderPainted(false);
						
					}
					else
					{
						b[i][i2] = new JButton(s[i][i2]);
						b[i][i2].setActionCommand(Integer.toString(i * 2 + i2));
						b[i][i2].addActionListener(this);
						add(b[i][i2]);
						b[i][i2].setEnabled(true);
						b[i][i2].setContentAreaFilled(true);
						b[i][i2].setBorderPainted(true);
						//System.out.println("drawn" + (i * 2 + i2));
					}
					b[i][i2].setOpaque(false);
					
					b[i][i2].setBounds(i % 2 * 462 + 15, i2 % 2 * 74 + 542, 462, 74);
					
				}
		//draw = false;
		repaint();
	}
	
	public int numberChosen()
	{
		//System.out.println("numberChosen");
		int temp = chosenNumber;
		chosenNumber = -2;
		return temp;
	}
	
	private void drawSprites(Graphics2D g2d)
	{
		
		g2d.drawImage(background.getSubimage(0, 0, 258, 146), 0 , 0, 239 * 4, (int)(111 * 4.75), null);
		//g2d.drawImage(FrontSprites.getSubimage((t.getTeam().get(PokemonGame.TrainerPokemon).pokemon.ColumnNum - 1) * n, t.getTeam().get(PokemonGame.TrainerPokemon).pokemon.RowNum * n, n, n), 600, 200, n * (PSize - 1), n * (PSize - 1), null);
		//g2d.drawImage(BackSprites.getSubimage((h.getTeam().get(PokemonGame.HeroPokemon).pokemon.ColumnNum - 1) * n, h.getTeam().get(PokemonGame.HeroPokemon).pokemon.RowNum * n, n, n), 175, 375, n * (PSize + 1), n * (PSize + 1), null);
		g2d.drawImage(FrontSprites.getSubimage((t.getTeam().get(Battle.TrainerPokemon).pokemon.ColumnNum - 1) * n, t.getTeam().get(Battle.TrainerPokemon).pokemon.RowNum * n, n, n), 570, 110, n * (PSize), n * (PSize), null);
		g2d.drawImage(BackSprites.getSubimage((h.getTeam().get(Battle.HeroPokemon).pokemon.ColumnNum - 1) * n, h.getTeam().get(Battle.HeroPokemon).pokemon.RowNum * n, n, n), 90, 287, n * (PSize + 1), n * (PSize + 1), null);
		g2d.drawImage(HealthBar.getSubimage(0, 133, 300, 24), 500, 425, 300, 24, null); // Hero health
		g2d.drawImage(HealthBar.getSubimage(0, 133, 300, 24), 100, 175, 300, 24, null); // Enemy Health
		//g2d.setColor(Color.RED);
		//g2d.fillRect(792, 434, (int)(-((h.getTeam().get(PokemonGame.HeroPokemon).getMaxHP() - h.getTeam().get(PokemonGame.HeroPokemon).getCurrentHP()) / h.getTeam().get(PokemonGame.HeroPokemon).getMaxHP()) * 234), 15);
		//g2d.fillRect(392, 284, (int)(-((t.getTeam().get(PokemonGame.HeroPokemon).getMaxHP() - t.getTeam().get(PokemonGame.HeroPokemon).getCurrentHP()) / t.getTeam().get(PokemonGame.HeroPokemon).getMaxHP()) * 234), 15);
	}
	
	private void drawTextBoxes(Graphics2D g2d)
	{
		
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillRect(0, 527, 955, 200 - 23);
		g2d.setStroke(new BasicStroke(10));
		g2d.setColor(Color.BLUE);
		g2d.drawRect(10, 537, 935, 180 - 23);
		g2d.setColor(Color.WHITE);
		g2d.fillRect(15, 542, 925, 170 - 23);
	}
	
	public void drawButtons(ArrayList<String> al)
	{
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 2; j++)
			{
				try
				{
					s[i][j] = al.get(i * 2 + j);
				}catch(ArrayIndexOutOfBoundsException e)
				{
					s[i][j] = null;
				}
			}
		draw = true;
		
	}
	
	public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        doDrawing(g);
    }
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		BufferedImage image = new BufferedImage(2, 5, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (java.awt.Graphics2D) image.getGraphics();
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("0"))
		{
			System.out.println("IT WORKS!");
			chosenNumber = 0;
			doDrawing(g2);
			
		}
		else if(e.getActionCommand().equals("1"))
		{
			System.out.println("IT WORKS!1");
			chosenNumber = 1;	
			doDrawing(g2);
				
		}			
		else if(e.getActionCommand().equals("2"))
		{
			System.out.println("IT WORKS!2");
			chosenNumber = 2;
			doDrawing(g2);
		}
		else if(e.getActionCommand().equals("3"))
		{
			System.out.println("IT WORKS!3");
			chosenNumber = 3;
			doDrawing(g2);
		}
	}
	
	public void doAction(int a1, int a2, int turn)
	{
		
			this.requestFocusInWindow();
	}
}
	

