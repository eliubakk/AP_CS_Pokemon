package red;

import java.io.IOException;

import javax.swing.*;

import trainers.*;

@SuppressWarnings("serial")
class MyFrame extends JFrame 
{
	DrawPanel dpnl;

	public MyFrame(Hero h, Trainer t) throws IOException 
	{
		
		dpnl = new DrawPanel(h, t);
	    add(dpnl);
	     
	    setSize(900, 900);
		//setSize(300, 300);
	    setTitle("Pokemon Red");
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	}

} 
