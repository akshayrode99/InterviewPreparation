package Book;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//* A program for viewing images.

public class ImageViewer
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new JFrame();
				frame.setTitle("ImageViewer");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
} 

// /**
//29 * A frame with a label to s

