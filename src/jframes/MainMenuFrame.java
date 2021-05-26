package jframes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenuFrame extends JFrame implements ActionListener {
	
	JButton startButton;
	JButton exitButton;

	public MainMenuFrame() {	
		
		startButton = new JButton();
		startButton.setBounds(500, 500, 280, 50);
		startButton.addActionListener(this);
		startButton.setText("D U E L");
		startButton.setFont(new Font("Impact", Font.BOLD, 22));
		startButton.setForeground(Color.white);
		startButton.setBackground(new Color(255, 109, 0));
		startButton.setFocusable(false);
		
		exitButton = new JButton();
		exitButton.setBounds(550, 600, 180, 50);
		exitButton.addActionListener(this);
		exitButton.setText("E X I T");
		exitButton.setFont(new Font("Impact",Font.BOLD, 22));
		exitButton.setForeground(new Color(255, 109, 0));
		exitButton.setBackground(Color.black);
		exitButton.setFocusable(false);
		

		this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("nhk.jpg"))));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon(MainMenuFrame.class.getResource("icon.jpg"));
		this.setIconImage(icon.getImage());
		this.setTitle("NKH");
		this.setResizable(false);
		this.setMinimumSize(new Dimension(1280, 720));
		this.setVisible(true);
		this.pack();

		this.add(startButton);
		this.add(exitButton);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			dispose();
			DuelFrame duelFrame = new DuelFrame();
		} else if (e.getSource() == exitButton) {
			dispose();
		}
	}

}
