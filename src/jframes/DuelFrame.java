package jframes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import cards.Card;
import cards.HatDeck;
import cards.MonsterCard;
import cards.WeekDeck;


public class DuelFrame extends JFrame implements ActionListener {

	JLabel playerNameLabel = new JLabel();
	JLabel playerLpLabel = new JLabel();

	JLabel opponentNameLabel = new JLabel();
	JLabel opponentLpLabel = new JLabel();

	int playerLp = 10000;
	int opponentLp = 10000;

	int currentPlayerMonster1Atk;
	int currentPlayerMonster2Atk;
	int currentPlayerMonster3Atk;

	int currentPlayerMonster1Def;
	int currentPlayerMonster2Def;
	int currentPlayerMonster3Def;

	int currentOpponentMonster1Atk;
	int currentOpponentMonster2Atk;
	int currentOpponentMonster3Atk;

	int currentOpponentMonster1Def;
	int currentOpponentMonster2Def;
	int currentOpponentMonster3Def;



	HatDeck hatDeck = new HatDeck();
	WeekDeck weekDeck = new WeekDeck();

	boolean playerMonsterZone1Occupied = false;
	boolean playerMonsterZone2Occupied = false;
	boolean playerMonsterZone3Occupied = false;
	boolean playerSpellZone1Occupied = false;
	boolean playerSpellZone2Occupied = false;
	boolean playerSpellZone3Occupied = false;

	boolean opponentMonsterZone1Occupied = false;
	boolean opponentMonsterZone2Occupied = false;
	boolean opponentMonsterZone3Occupied = false;

	boolean opponentSpellZone2Occupied = false;


	boolean playerHandSlot1Occupied = false;
	boolean playerHandSlot2Occupied = false;
	boolean playerHandSlot3Occupied = false;
	boolean playerHandSlot4Occupied = false;
	boolean playerHandSlot5Occupied = false;
	boolean playerHandSlot6Occupied = false;
	boolean playerHandSlot7Occupied = false;
	boolean playerHandSlot8Occupied = false;
	boolean playerHandSlot9Occupied = false;
	boolean playerHandSlot10Occupied = false;
	boolean playerHandSlot11Occupied = false;
	boolean playerHandSlot12Occupied = false;
	boolean playerHandSlot13Occupied = false;
	boolean playerHandSlot14Occupied = false;
	boolean playerHandSlot15Occupied = false;
	boolean playerHandSlot16Occupied = false;
	boolean playerHandSlot17Occupied = false;
	boolean playerHandSlot18Occupied = false;
	boolean playerHandSlot19Occupied = false;
	boolean playerHandSlot20Occupied = false;

	boolean opponentHandSlot1Occupied = false;
	boolean opponentHandSlot2Occupied = false;
	boolean opponentHandSlot3Occupied = false;
	boolean opponentHandSlot4Occupied = false;
	boolean opponentHandSlot5Occupied = false;
	boolean opponentHandSlot6Occupied = false;
	boolean opponentHandSlot7Occupied = false;
	boolean opponentHandSlot8Occupied = false;
	boolean opponentHandSlot9Occupied = false;
	boolean opponentHandSlot10Occupied = false;
	boolean opponentHandSlot11Occupied = false;
	boolean opponentHandSlot12Occupied = false;
	boolean opponentHandSlot13Occupied = false;
	boolean opponentHandSlot14Occupied = false;
	boolean opponentHandSlot15Occupied = false;
	boolean opponentHandSlot16Occupied = false;
	boolean opponentHandSlot17Occupied = false;
	boolean opponentHandSlot18Occupied = false;
	boolean opponentHandSlot19Occupied = false;
	boolean opponentHandSlot20Occupied = false;

	JPanel playerHand = new JPanel();
	JButton playerHand1 = new JButton();
	JButton playerHand2 = new JButton();
	JButton playerHand3 = new JButton();
	JButton playerHand4 = new JButton();
	JButton playerHand5 = new JButton();
	JButton playerHand6 = new JButton();
	JButton playerHand7 = new JButton();
	JButton playerHand8 = new JButton();
	JButton playerHand9 = new JButton();
	JButton playerHand10 = new JButton();
	JButton playerHand11 = new JButton();
	JButton playerHand12 = new JButton();
	JButton playerHand13 = new JButton();
	JButton playerHand14 = new JButton();
	JButton playerHand15 = new JButton();
	JButton playerHand16 = new JButton();
	JButton playerHand17 = new JButton();
	JButton playerHand18 = new JButton();
	JButton playerHand19 = new JButton();
	JButton playerHand20 = new JButton();

	JPanel opponentHand = new JPanel();
	JButton opponentHand1 = new JButton();
	JButton opponentHand2 = new JButton();
	JButton opponentHand3 = new JButton();
	JButton opponentHand4 = new JButton();
	JButton opponentHand5 = new JButton();
	JButton opponentHand6 = new JButton();
	JButton opponentHand7 = new JButton();
	JButton opponentHand8 = new JButton();
	JButton opponentHand9 = new JButton();
	JButton opponentHand10 = new JButton();
	JButton opponentHand11 = new JButton();
	JButton opponentHand12 = new JButton();
	JButton opponentHand13 = new JButton();
	JButton opponentHand14 = new JButton();
	JButton opponentHand15 = new JButton();
	JButton opponentHand16 = new JButton();
	JButton opponentHand17 = new JButton();
	JButton opponentHand18 = new JButton();
	JButton opponentHand19 = new JButton();
	JButton opponentHand20 = new JButton();


	JButton nextPhaseButton = new JButton();

	JLabel cardInfo = new JLabel();

	JButton playerMonsterZone1 = new JButton();
	JButton playerMonsterZone2 = new JButton();
	JButton playerMonsterZone3 = new JButton();

	JButton playerSpellZone1 = new JButton();
	JButton playerSpellZone2 = new JButton();
	JButton playerSpellZone3 = new JButton();

	JButton playerDeck = new JButton();
	JButton playerField = new JButton();
	JButton playerGraveyard = new JButton();
	JButton playerExtraDeck = new JButton();

	JButton opponentMonsterZone1 = new JButton();
	JButton opponentMonsterZone2 = new JButton();
	JButton opponentMonsterZone3 = new JButton();
	
	JButton opponentSpellZone3 = new JButton();

	JButton opponentDeck = new JButton();
	JButton opponentField = new JButton();
	JButton opponentGraveyard = new JButton();
	JButton opponentExtraDeck = new JButton();

	ImageIcon bigcover = new ImageIcon(getClass().getClassLoader().getResource("cover.png"));
	ImageIcon minicover = new ImageIcon(getClass().getClassLoader().getResource("minicover.png"));


	public DuelFrame() {

		UIManager.put("OptionPane.background", new ColorUIResource(255, 110, 0));
		UIManager.put("Panel.background", new ColorUIResource(255, 110, 0));
		UIManager.put("Button.background", Color.blue);
		UIManager.put("Button.foreground", Color.white);
		UIManager.put("text", Color.white);
		UIManager.put("windowBorder", null);

		this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("duelbackground.jpg"))));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setMinimumSize(new Dimension(1280, 720));
		this.setVisible(true);
		ImageIcon icon = new ImageIcon(MainMenuFrame.class.getResource("icon.jpg"));
		this.setIconImage(icon.getImage());
		this.setTitle("NHK");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.isUndecorated();
		this.pack();

		playerNameLabel.setBounds(1100, 480, 300, 80);
		playerNameLabel.setFont(new Font("Impact", Font.PLAIN, 40));
		playerNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		playerNameLabel.setVerticalTextPosition(JLabel.CENTER);
		playerNameLabel.setForeground(Color.white);
		playerNameLabel.setText("    Player");
		this.add(playerNameLabel);

		playerLpLabel.setBounds(1110, 545, 145, 40);
		playerLpLabel.setFont(new Font("Impact", Font.PLAIN, 28));
		playerLpLabel.setHorizontalTextPosition(JLabel.CENTER);
		playerLpLabel.setVerticalTextPosition(JLabel.CENTER);
		playerLpLabel.setForeground(Color.white);
		playerLpLabel.setText("   LP : " + playerLp);
		this.add(playerLpLabel);

		opponentNameLabel.setBounds(1100, 100, 300, 80);
		opponentNameLabel.setFont(new Font("Impact", Font.PLAIN, 40));
		opponentNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		opponentNameLabel.setVerticalTextPosition(JLabel.CENTER);
		opponentNameLabel.setForeground(Color.white);
		opponentNameLabel.setText("Opponent");
		this.add(opponentNameLabel);

		opponentLpLabel.setBounds(1110, 165, 145, 40);
		opponentLpLabel.setFont(new Font("Impact", Font.PLAIN, 28));
		opponentLpLabel.setHorizontalTextPosition(JLabel.CENTER);
		opponentLpLabel.setVerticalTextPosition(JLabel.CENTER);
		opponentLpLabel.setForeground(Color.white);
		opponentLpLabel.setText("   LP : " + opponentLp);
		this.add(opponentLpLabel);

		int i = 0;

		playerHand1.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand1.addActionListener(this);
		playerHand1.setFocusable(false);
		playerHand1.setVisible(false);
		playerHand.add(playerHand1);

		playerHand2.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand2.addActionListener(this);
		playerHand2.setFocusable(false);
		playerHand2.setVisible(false);
		playerHand.add(playerHand2);

		playerHand3.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand3.addActionListener(this);
		playerHand3.setFocusable(false);
		playerHand3.setVisible(false);
		playerHand.add(playerHand3);

		playerHand4.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand4.addActionListener(this);
		playerHand4.setFocusable(false);
		playerHand4.setVisible(false);
		playerHand.add(playerHand4);

		playerHand5.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand5.addActionListener(this);
		playerHand5.setFocusable(false);
		playerHand5.setVisible(false);
		playerHand.add(playerHand5);

		playerHand6.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand6.addActionListener(this);
		playerHand6.setVisible(false);
		playerHand.add(playerHand6);

		playerHand7.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand7.addActionListener(this);
		playerHand7.setFocusable(false);
		playerHand7.setVisible(false);
		playerHand.add(playerHand7);

		playerHand8.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand8.addActionListener(this);
		playerHand8.setFocusable(false);
		playerHand8.setVisible(false);
		playerHand.add(playerHand8);

		playerHand9.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand9.addActionListener(this);
		playerHand9.setFocusable(false);
		playerHand9.setVisible(false);
		playerHand.add(playerHand9);

		playerHand10.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand10.addActionListener(this);
		playerHand10.setFocusable(false);
		playerHand10.setVisible(false);
		playerHand.add(playerHand10);

		playerHand11.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand11.addActionListener(this);
		playerHand11.setFocusable(false);
		playerHand11.setVisible(false);
		playerHand.add(playerHand11);

		playerHand12.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand12.addActionListener(this);
		playerHand12.setFocusable(false);
		playerHand12.setVisible(false);
		playerHand.add(playerHand12);

		playerHand13.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand13.addActionListener(this);
		playerHand13.setFocusable(false);
		playerHand13.setVisible(false);
		playerHand.add(playerHand13);

		playerHand14.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand14.addActionListener(this);
		playerHand14.setFocusable(false);
		playerHand14.setVisible(false);
		playerHand.add(playerHand14);

		playerHand15.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand15.addActionListener(this);
		playerHand15.setFocusable(false);
		playerHand15.setVisible(false);
		playerHand.add(playerHand15);

		playerHand16.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand16.addActionListener(this);
		playerHand16.setFocusable(false);
		playerHand16.setVisible(false);
		playerHand.add(playerHand16);

		playerHand17.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand17.addActionListener(this);
		playerHand17.setFocusable(false);
		playerHand17.setVisible(false);
		playerHand.add(playerHand17);

		playerHand18.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand18.addActionListener(this);
		playerHand18.setFocusable(false);
		playerHand18.setVisible(false);
		playerHand.add(playerHand18);

		playerHand19.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand19.addActionListener(this);
		playerHand19.setFocusable(false);
		playerHand19.setVisible(false);
		playerHand.add(playerHand19);

		playerHand20.setBounds(i, 0, 110, 155);
		i += 75;
		playerHand20.addActionListener(this);
		playerHand20.setFocusable(false);
		playerHand20.setVisible(false);
		playerHand.add(playerHand20);

		playerHand.setLayout(null);
		playerHand.setPreferredSize(new Dimension(1550, 155));
		playerHand.setBackground(new Color(255, 97, 0));

		JScrollPane playerHandScroll = new JScrollPane(playerHand, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		playerHandScroll.setEnabled(true);
		playerHandScroll.setBounds(0, 563, 640, 155);

		this.add(playerHandScroll);

		i = 0;

		opponentHand1.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand1.addActionListener(this);
		opponentHand1.setFocusable(false);
		opponentHand1.setVisible(false);
		opponentHand.add(opponentHand1);

		opponentHand2.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand2.addActionListener(this);
		opponentHand2.setFocusable(false);
		opponentHand2.setVisible(false);
		opponentHand.add(opponentHand2);

		opponentHand3.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand3.addActionListener(this);
		opponentHand3.setFocusable(false);
		opponentHand3.setVisible(false);
		opponentHand.add(opponentHand3);

		opponentHand4.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand4.addActionListener(this);
		opponentHand4.setFocusable(false);
		opponentHand4.setVisible(false);
		opponentHand.add(opponentHand4);

		opponentHand5.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand5.addActionListener(this);
		opponentHand5.setFocusable(false);
		opponentHand5.setVisible(false);
		opponentHand.add(opponentHand5);

		opponentHand6.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand6.addActionListener(this);
		opponentHand6.setVisible(false);
		opponentHand.add(opponentHand6);

		opponentHand7.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand7.addActionListener(this);
		opponentHand7.setFocusable(false);
		opponentHand7.setVisible(false);
		opponentHand.add(opponentHand7);

		opponentHand8.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand8.addActionListener(this);
		opponentHand8.setFocusable(false);
		opponentHand8.setVisible(false);
		opponentHand.add(opponentHand8);

		opponentHand9.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand9.addActionListener(this);
		opponentHand9.setFocusable(false);
		opponentHand9.setVisible(false);
		opponentHand.add(opponentHand9);

		opponentHand10.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand10.addActionListener(this);
		opponentHand10.setFocusable(false);
		opponentHand10.setVisible(false);
		opponentHand.add(opponentHand10);

		opponentHand11.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand11.addActionListener(this);
		opponentHand11.setFocusable(false);
		opponentHand11.setVisible(false);
		opponentHand.add(opponentHand11);

		opponentHand12.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand12.addActionListener(this);
		opponentHand12.setFocusable(false);
		opponentHand12.setVisible(false);
		opponentHand.add(opponentHand12);

		opponentHand13.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand13.addActionListener(this);
		opponentHand13.setFocusable(false);
		opponentHand13.setVisible(false);
		opponentHand.add(opponentHand13);

		opponentHand14.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand14.addActionListener(this);
		opponentHand14.setFocusable(false);
		opponentHand14.setVisible(false);
		opponentHand.add(opponentHand14);

		opponentHand15.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand15.addActionListener(this);
		opponentHand15.setFocusable(false);
		opponentHand15.setVisible(false);
		opponentHand.add(opponentHand15);

		opponentHand16.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand16.addActionListener(this);
		opponentHand16.setFocusable(false);
		opponentHand16.setVisible(false);
		opponentHand.add(opponentHand16);

		opponentHand17.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand17.addActionListener(this);
		opponentHand17.setFocusable(false);
		opponentHand17.setVisible(false);
		opponentHand.add(opponentHand17);

		opponentHand18.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand18.addActionListener(this);
		opponentHand18.setFocusable(false);
		opponentHand18.setVisible(false);
		opponentHand.add(opponentHand18);

		opponentHand19.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand19.addActionListener(this);
		opponentHand19.setFocusable(false);
		opponentHand19.setVisible(false);
		opponentHand.add(opponentHand19);

		opponentHand20.setBounds(i, 0, 110, 155);
		i += 75;
		opponentHand20.addActionListener(this);
		opponentHand20.setFocusable(false);
		opponentHand20.setVisible(false);
		opponentHand.add(opponentHand20);

		opponentHand.setLayout(null);
		opponentHand.setBackground(new Color(255, 97, 0));
		opponentHand.setPreferredSize(new Dimension(1550, 155));

		JScrollPane opponentHandScroll = new JScrollPane(opponentHand, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		opponentHandScroll.setEnabled(true);
		opponentHandScroll.setBounds(0, 0, 640, 155);

		this.add(opponentHandScroll);

		nextPhaseButton.setBounds(400, 450, 150, 50);
		nextPhaseButton.addActionListener(this);
		nextPhaseButton.setText("END TURN");
		nextPhaseButton.setFont(new Font("Impact", Font.BOLD, 16));
		nextPhaseButton.setForeground(Color.white);
		nextPhaseButton.setBackground(Color.black);
		nextPhaseButton.setFocusable(false);
		this.add(nextPhaseButton);

		cardInfo.setBounds(0, 162, 273, 395);
		cardInfo.setIcon(bigcover);
		cardInfo.setBackground(Color.black);
		cardInfo.setBorder(BorderFactory.createLineBorder(Color.white));
		this.add(cardInfo);

		playerDeck.setBounds(972, 557, 106, 155);
		playerDeck.setBackground(Color.blue);
		playerDeck.setRolloverEnabled(false);
		playerDeck.setFont(new Font("Impact", Font.PLAIN, 30));
		playerDeck.setIcon(minicover);
		playerDeck.setBorder(BorderFactory.createLineBorder(Color.orange));
		playerDeck.addActionListener(this);
		this.add(playerDeck);

		playerGraveyard.setBounds(676, 557, 106, 155);
		playerGraveyard.setBackground(Color.black);
		playerGraveyard.setBorder(BorderFactory.createLineBorder(Color.red));
		playerGraveyard.addActionListener(this);
		this.add(playerGraveyard);

		playerMonsterZone1.setBounds(676, 382, 106, 155);
		playerMonsterZone1.setBackground(Color.white);
		playerMonsterZone1.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone1.addActionListener(this);
		this.add(playerMonsterZone1);

		playerMonsterZone2.setBounds(823, 382, 106, 155);
		playerMonsterZone2.setBackground(Color.white);
		playerMonsterZone2.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone2.addActionListener(this);
		this.add(playerMonsterZone2);

		playerMonsterZone3.setBounds(972, 382, 106, 155);
		playerMonsterZone3.setBackground(Color.white);
		playerMonsterZone3.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone3.addActionListener(this);
		this.add(playerMonsterZone3);

		playerSpellZone2.setBounds(823, 557, 106, 155);
		playerSpellZone2.setBackground(new Color(255, 114, 0));
		playerSpellZone2.setBorder(BorderFactory.createLineBorder(Color.white));
		playerSpellZone2.addActionListener(this);
		this.add(playerSpellZone2);

		opponentDeck.setBounds(676, 5, 106, 155);
		opponentDeck.setBackground(Color.blue);
		opponentDeck.setIcon(minicover);
		opponentDeck.setBorder(BorderFactory.createLineBorder(Color.orange));
		opponentDeck.addActionListener(this);
		this.add(opponentDeck);

		opponentGraveyard.setBounds(972, 5, 106, 155);
		opponentGraveyard.setBackground(Color.black);
		opponentGraveyard.setBorder(BorderFactory.createLineBorder(Color.red));
		opponentGraveyard.addActionListener(this);
		this.add(opponentGraveyard);

		opponentMonsterZone1.setBounds(972, 181, 106, 155);
		opponentMonsterZone1.setBackground(Color.white);
		opponentMonsterZone1.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentMonsterZone1.addActionListener(this);
		this.add(opponentMonsterZone1);

		opponentMonsterZone2.setBounds(823, 181, 106, 155);
		opponentMonsterZone2.setBackground(Color.white);
		opponentMonsterZone2.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentMonsterZone2.addActionListener(this);
		this.add(opponentMonsterZone2);

		opponentMonsterZone3.setBounds(676, 181, 106, 155);
		opponentMonsterZone3.setBackground(Color.white);
		opponentMonsterZone3.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentMonsterZone3.addActionListener(this);
		this.add(opponentMonsterZone3);

		opponentSpellZone3.setBounds(823, 5, 106, 155);
		opponentSpellZone3.setBackground(new Color(255, 114, 0));
		opponentSpellZone3.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentSpellZone3.addActionListener(this);
		this.add(opponentSpellZone3);
		
		// this.summon(hatDeck.getBlueHat1().getMiniIcon());
		drawCardPlayer();
		drawCardPlayer();
		drawCardPlayer();
		drawCardPlayer();
		drawCardPlayer();

		drawCardOpponent();
		drawCardOpponent();
		drawCardOpponent();
		drawCardOpponent();
		drawCardOpponent();

	}


	public boolean damagePlayer(int damage) {
		this.playerLp -= damage;
		return true;
	}

	public boolean damageOpponent(int damage) {
		this.opponentLp -= damage;
		return true;
	}

	public boolean summon(JButton button) {
		MonsterCard object = (MonsterCard) returnMonsterCardObjectByFieldButton(button);
		int monsterToBeSummonedAtk = object.getAtk();
		int monsterToBeSummonedDef = object.getDef();
		if (this.playerMonsterZone1Occupied==false) {
			this.playerMonsterZone1Occupied = true;
			this.playerMonsterZone1.setIcon(object.getMiniIcon());
			this.currentOpponentMonster1Atk = monsterToBeSummonedAtk;
			this.currentOpponentMonster1Def = monsterToBeSummonedDef;
			return true;
		} else if (this.playerMonsterZone2Occupied==false) {
			this.playerMonsterZone2Occupied = true;
			this.playerMonsterZone2.setIcon(object.getMiniIcon());
			this.currentOpponentMonster2Atk = monsterToBeSummonedAtk;
			this.currentOpponentMonster2Def = monsterToBeSummonedDef;
			return true;
		} else if (this.playerMonsterZone3Occupied == false) {
			this.playerMonsterZone3Occupied = true;
			this.playerMonsterZone3.setIcon(object.getMiniIcon());
			this.currentOpponentMonster3Atk = monsterToBeSummonedAtk;
			this.currentOpponentMonster3Def = monsterToBeSummonedDef;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "You can only control up to three monsters at once!",
					"Can't summon more monsters!", 0);
			return false;
		}

	}

	public boolean advancedSummon(JButton button) {
		MonsterCard object = (MonsterCard) returnMonsterCardObjectByFieldButton(button);
		int monsterToBeSummonedAtk = object.getAtk();
		int monsterToBeSummonedDef = object.getDef();
		if (this.playerMonsterZone1Occupied == false) {
			this.playerMonsterZone1Occupied = true;
			this.playerMonsterZone1.setIcon(object.getMiniIcon());
			this.currentOpponentMonster1Atk = monsterToBeSummonedAtk;
			this.currentOpponentMonster1Def = monsterToBeSummonedDef;
			JOptionPane.showMessageDialog(null, "Tribute summon!", "Tribute summon!", 0);
			return true;
		} else if (this.playerMonsterZone2Occupied == false) {
			this.playerMonsterZone2Occupied = true;
			this.playerMonsterZone2.setIcon(object.getMiniIcon());
			this.currentOpponentMonster2Atk = monsterToBeSummonedAtk;
			this.currentOpponentMonster2Def = monsterToBeSummonedDef;
			JOptionPane.showMessageDialog(null, "Tribute summon!", "Tribute summon!", 0);
			return true;
		} else if (this.playerMonsterZone3Occupied == false) {
			this.playerMonsterZone3Occupied = true;
			this.playerMonsterZone3.setIcon(object.getMiniIcon());
			this.currentOpponentMonster3Atk = monsterToBeSummonedAtk;
			this.currentOpponentMonster3Def = monsterToBeSummonedDef;
			JOptionPane.showMessageDialog(null, "Tribute summon!", "Tribute summon!", 0);
			return true;
		} else {
			return false;
		}

	}

	public Card checkCardByInteger(Integer i) {
		switch (i) {
		case 1: return hatDeck.getBlueHat1();
		case 2: return hatDeck.getBlueHat2();
		case 3: return hatDeck.getBlueHat3();

		case 4: return hatDeck.getGreenHat1();
		case 5: return hatDeck.getGreenHat2();
		case 6: return hatDeck.getGreenHat3();
		
		case 7: return hatDeck.getYellowHat1();
		case 8: return hatDeck.getYellowHat2();
		case 9: return hatDeck.getYellowHat3();
		
		case 10: return hatDeck.getWhiteHat1();
		case 11: return hatDeck.getWhiteHat2();
		
		case 12: return hatDeck.getEnlarge1();
		case 13: return hatDeck.getEnlarge1();
		case 14: return hatDeck.getEnlarge1();
		
		case 15: return hatDeck.getMultiply1();
		case 16: return hatDeck.getMultiply2();
		case 17: return hatDeck.getMultiply3();
		
		case 18: return hatDeck.getTnt1();
		case 19: return hatDeck.getTnt2();
		case 20: return hatDeck.getTnt3();
		
		case 21: return weekDeck.getFriday1();
		case 22: return weekDeck.getFriday2();
		
		case 23: return weekDeck.getMonday1();
		case 24: return weekDeck.getMonday2();
		
		case 25: return weekDeck.getSaturday1();
		case 26: return weekDeck.getSaturday2();
		
		case 27: return weekDeck.getSunday1();
		case 28: return weekDeck.getSunday2();
		
		case 29: return weekDeck.getThursday1();
		case 30: return weekDeck.getThursday2();
		
		case 31: return weekDeck.getTuesday1();
		case 32: return weekDeck.getTuesday2();
		
		case 33: return weekDeck.getWednesday1();
		case 34: return weekDeck.getWednesday2();
		
		case 35: return weekDeck.getFridayThe131();
		case 36: return weekDeck.getFridayThe132();
		case 37: return weekDeck.getFridayThe133();
		
		case 38: return weekDeck.getHoliday1();
		case 39: return weekDeck.getHoliday2();
		case 40: return weekDeck.getHoliday3();
		default: return null;
		}
	}
	
	public boolean drawCardPlayer() {
		Integer nextCardId;
		try {
			nextCardId = hatDeck.getHatDeckArrayList().get(0);
		} catch (IndexOutOfBoundsException ignored) {
			this.playerDeck.setIcon(null);
			JOptionPane.showMessageDialog(null, "There's no cards remaining in your deck!",
					"Can't draw a card!", 0);
			return false;
		}
		this.hatDeck.removeFirstElementFromHatDeckArrayList();
		Card cardToBeDraw = checkCardByInteger(nextCardId);

			if (this.playerHandSlot1Occupied == false) {
				this.playerHandSlot1Occupied = true;
				this.playerHand1.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand1.setVisible(true);
				return true;
			} else if (this.playerHandSlot2Occupied == false) {
				this.playerHandSlot2Occupied = true;
				this.playerHand2.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand2.setVisible(true);
				return true;
			} else if (this.playerHandSlot3Occupied == false) {
				this.playerHandSlot3Occupied = true;
				this.playerHand3.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand3.setVisible(true);
				return true;
			} else if (this.playerHandSlot4Occupied == false) {
				this.playerHandSlot4Occupied = true;
				this.playerHand4.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand4.setVisible(true);
				return true;
			} else if (this.playerHandSlot5Occupied == false) {
				this.playerHandSlot5Occupied = true;
				this.playerHand5.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand5.setVisible(true);
				return true;
			} else if (this.playerHandSlot6Occupied == false) {
				this.playerHandSlot6Occupied = true;
				this.playerHand6.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand6.setVisible(true);
				return true;
			} else if (this.playerHandSlot7Occupied == false) {
				this.playerHandSlot7Occupied = true;
				this.playerHand7.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand7.setVisible(true);
				return true;
			} else if (this.playerHandSlot8Occupied == false) {
				this.playerHandSlot8Occupied = true;
				this.playerHand8.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand8.setVisible(true);
				return true;
			} else if (this.playerHandSlot9Occupied == false) {
				this.playerHandSlot9Occupied = true;
				this.playerHand9.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand9.setVisible(true);
				return true;
			} else if (this.playerHandSlot10Occupied == false) {
				this.playerHandSlot10Occupied = true;
				this.playerHand10.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand10.setVisible(true);
				return true;
			} else if (this.playerHandSlot11Occupied == false) {
				this.playerHandSlot11Occupied = true;
				this.playerHand11.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand11.setVisible(true);
				return true;
			} else if (this.playerHandSlot12Occupied == false) {
				this.playerHandSlot12Occupied = true;
				this.playerHand12.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand12.setVisible(true);
				return true;
			} else if (this.playerHandSlot13Occupied == false) {
				this.playerHandSlot13Occupied = true;
				this.playerHand13.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand13.setVisible(true);
				return true;
			} else if (this.playerHandSlot14Occupied == false) {
				this.playerHandSlot14Occupied = true;
				this.playerHand14.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand14.setVisible(true);
				return true;
			} else if (this.playerHandSlot15Occupied == false) {
				this.playerHandSlot15Occupied = true;
				this.playerHand15.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand15.setVisible(true);
				return true;
			} else if (this.playerHandSlot16Occupied == false) {
				this.playerHandSlot16Occupied = true;
				this.playerHand16.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand16.setVisible(true);
				return true;
			} else if (this.playerHandSlot17Occupied == false) {
				this.playerHandSlot17Occupied = true;
				this.playerHand17.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand17.setVisible(true);
				return true;
			} else if (this.playerHandSlot18Occupied == false) {
				this.playerHandSlot18Occupied = true;
				this.playerHand18.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand18.setVisible(true);
				return true;
			} else if (this.playerHandSlot19Occupied == false) {
				this.playerHandSlot19Occupied = true;
				this.playerHand19.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand19.setVisible(true);
				return true;
			} else if (this.playerHandSlot20Occupied == false) {
				this.playerHandSlot20Occupied = true;
				this.playerHand20.setIcon(cardToBeDraw.getMiniIcon());
				this.playerHand20.setVisible(true);
				return true;
			} else {
				return false;
			}
	}

	public boolean drawCardOpponent() {
		Integer nextCardId;
		try {
			nextCardId = weekDeck.getWeekDeckArrayList().get(0);
		} catch (IndexOutOfBoundsException ignored) {
			this.opponentDeck.setIcon(null);
			return false;
		}
		this.weekDeck.removeFirstElementFromWeekDeckArrayList();
		Card cardToBeDraw = checkCardByInteger(nextCardId);
		if (this.opponentHandSlot1Occupied == false) {
			this.opponentHandSlot1Occupied = true;
			this.opponentHand1.setIcon(minicover);
			this.opponentHand1.setVisible(true);
			return true;
		} else if (this.opponentHandSlot2Occupied == false) {
			this.opponentHandSlot2Occupied = true;
			this.opponentHand2.setIcon(minicover);
			this.opponentHand2.setVisible(true);
			return true;
		} else if (this.opponentHandSlot3Occupied == false) {
			this.opponentHandSlot3Occupied = true;
			this.opponentHand3.setIcon(minicover);
			this.opponentHand3.setVisible(true);
			return true;
		} else if (this.opponentHandSlot4Occupied == false) {
			this.opponentHandSlot4Occupied = true;
			this.opponentHand4.setIcon(minicover);
			this.opponentHand4.setVisible(true);
			return true;
		} else if (this.opponentHandSlot5Occupied == false) {
			this.opponentHandSlot5Occupied = true;
			this.opponentHand5.setIcon(minicover);
			this.opponentHand5.setVisible(true);
			return true;
		} else if (this.opponentHandSlot6Occupied == false) {
			this.opponentHandSlot6Occupied = true;
			this.opponentHand6.setIcon(minicover);
			this.opponentHand6.setVisible(true);
			return true;
		} else if (this.opponentHandSlot7Occupied == false) {
			this.opponentHandSlot7Occupied = true;
			this.opponentHand7.setIcon(minicover);
			this.opponentHand7.setVisible(true);
			return true;
		} else if (this.opponentHandSlot8Occupied == false) {
			this.opponentHandSlot8Occupied = true;
			this.opponentHand8.setIcon(minicover);
			this.opponentHand8.setVisible(true);
			return true;
		} else if (this.opponentHandSlot9Occupied == false) {
			this.opponentHandSlot9Occupied = true;
			this.opponentHand9.setIcon(minicover);
			this.opponentHand9.setVisible(true);
			return true;
		} else if (this.opponentHandSlot10Occupied == false) {
			this.opponentHandSlot10Occupied = true;
			this.opponentHand10.setIcon(minicover);
			this.opponentHand10.setVisible(true);
			return true;
		} else if (this.opponentHandSlot11Occupied == false) {
			this.opponentHandSlot11Occupied = true;
			this.opponentHand11.setIcon(minicover);
			this.opponentHand11.setVisible(true);
			return true;
		} else if (this.opponentHandSlot12Occupied == false) {
			this.opponentHandSlot12Occupied = true;
			this.opponentHand12.setIcon(minicover);
			this.opponentHand12.setVisible(true);
			return true;
		} else if (this.opponentHandSlot13Occupied == false) {
			this.opponentHandSlot13Occupied = true;
			this.opponentHand13.setIcon(minicover);
			this.opponentHand13.setVisible(true);
			return true;
		} else if (this.opponentHandSlot14Occupied == false) {
			this.opponentHandSlot14Occupied = true;
			this.opponentHand14.setIcon(minicover);
			this.opponentHand14.setVisible(true);
			return true;
		} else if (this.opponentHandSlot15Occupied == false) {
			this.opponentHandSlot15Occupied = true;
			this.opponentHand15.setIcon(minicover);
			this.opponentHand15.setVisible(true);
			return true;
		} else if (this.opponentHandSlot16Occupied == false) {
			this.opponentHandSlot16Occupied = true;
			this.opponentHand16.setIcon(minicover);
			this.opponentHand16.setVisible(true);
			return true;
		} else if (this.opponentHandSlot17Occupied == false) {
			this.opponentHandSlot17Occupied = true;
			this.opponentHand17.setIcon(minicover);
			this.opponentHand17.setVisible(true);
			return true;
		} else if (this.opponentHandSlot18Occupied == false) {
			this.opponentHandSlot18Occupied = true;
			this.opponentHand18.setIcon(minicover);
			this.opponentHand18.setVisible(true);
			return true;
		} else if (this.opponentHandSlot19Occupied == false) {
			this.opponentHandSlot19Occupied = true;
			this.opponentHand19.setIcon(minicover);
			this.opponentHand19.setVisible(true);
			return true;
		} else if (this.opponentHandSlot20Occupied == false) {
			this.opponentHandSlot20Occupied = true;
			this.opponentHand20.setIcon(minicover);
			this.opponentHand20.setVisible(true);
			return true;
		} else {
			return false;
		}
	}

	public void returnBigCardBySmallCard(JButton button) {
		Icon smallCardToBeConverted = button.getIcon();
		Icon convertedBigIcon = null;
		if (smallCardToBeConverted == hatDeck.getBlueHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat3().getMiniIcon()) {
			convertedBigIcon = hatDeck.getBlueHat1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == hatDeck.getGreenHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat3().getMiniIcon()) {
			convertedBigIcon = hatDeck.getGreenHat1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == hatDeck.getYellowHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat3().getMiniIcon()) {
			convertedBigIcon = hatDeck.getYellowHat1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == hatDeck.getWhiteHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getWhiteHat2().getMiniIcon()) {
			convertedBigIcon = hatDeck.getWhiteHat1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == hatDeck.getEnlarge1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getEnlarge2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getEnlarge3().getMiniIcon()) {
			convertedBigIcon = hatDeck.getEnlarge1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == hatDeck.getMultiply1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getMultiply2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getMultiply3().getMiniIcon()) {
			convertedBigIcon = hatDeck.getMultiply1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == hatDeck.getTnt1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getTnt2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getTnt3().getMiniIcon()) {
			convertedBigIcon = hatDeck.getTnt1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getFriday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFriday2().getMiniIcon()) {
			convertedBigIcon = weekDeck.getFriday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getMonday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getMonday2().getMiniIcon()) {
			convertedBigIcon = weekDeck.getMonday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getSaturday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSaturday2().getMiniIcon()) {
			convertedBigIcon = weekDeck.getSaturday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getSunday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSunday2().getMiniIcon()) {
			convertedBigIcon = weekDeck.getSunday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getThursday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getThursday2().getMiniIcon()) {
			convertedBigIcon = weekDeck.getThursday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getTuesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getTuesday2().getMiniIcon()) {
			convertedBigIcon = weekDeck.getTuesday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getWednesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getWednesday2().getMiniIcon()) {
			convertedBigIcon = weekDeck.getWednesday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getFridayThe131().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFridayThe132().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFridayThe133().getMiniIcon()) {
			convertedBigIcon = weekDeck.getFridayThe131().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		} else if (smallCardToBeConverted == weekDeck.getHoliday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getHoliday2().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getHoliday3().getMiniIcon()) {
			convertedBigIcon = weekDeck.getHoliday1().getBigIcon();
			this.cardInfo.setIcon(convertedBigIcon);
		}
	}

	public Card returnMonsterCardObjectByFieldButton(JButton button) {
		Icon smallCardToBeConverted = button.getIcon();
		MonsterCard returnedCard = null;
		if (smallCardToBeConverted == hatDeck.getBlueHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat3().getMiniIcon()) {
			returnedCard = hatDeck.getBlueHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getGreenHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat3().getMiniIcon()) {
			returnedCard = hatDeck.getGreenHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getYellowHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat3().getMiniIcon()) {
			returnedCard = hatDeck.getYellowHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getWhiteHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getWhiteHat2().getMiniIcon()) {
			returnedCard = hatDeck.getWhiteHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getFriday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFriday2().getMiniIcon()) {
			returnedCard = weekDeck.getFriday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getMonday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getMonday2().getMiniIcon()) {
			returnedCard = weekDeck.getMonday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getSaturday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSaturday2().getMiniIcon()) {
			returnedCard = weekDeck.getSaturday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getSunday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSunday2().getMiniIcon()) {
			returnedCard = weekDeck.getSunday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getThursday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getThursday2().getMiniIcon()) {
			returnedCard = weekDeck.getThursday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getTuesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getTuesday2().getMiniIcon()) {
			returnedCard = weekDeck.getTuesday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getWednesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getWednesday2().getMiniIcon()) {
			returnedCard = weekDeck.getWednesday1();
			return returnedCard;
		} else {
			return null;
		}
	}

	public Card returnCardObjectByFieldButton(JButton button) {
		Icon smallCardToBeConverted = button.getIcon();
		Card returnedCard = null;
		if (smallCardToBeConverted == hatDeck.getBlueHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat3().getMiniIcon()) {
			returnedCard = hatDeck.getBlueHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getGreenHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat3().getMiniIcon()) {
			returnedCard = hatDeck.getGreenHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getYellowHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat3().getMiniIcon()) {
			returnedCard = hatDeck.getYellowHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getWhiteHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getWhiteHat2().getMiniIcon()) {
			returnedCard = hatDeck.getWhiteHat1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getEnlarge1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getEnlarge2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getEnlarge3().getMiniIcon()) {
			returnedCard = hatDeck.getEnlarge1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getMultiply1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getMultiply2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getMultiply3().getMiniIcon()) {
			returnedCard = hatDeck.getMultiply1();
			return returnedCard;
		} else if (smallCardToBeConverted == hatDeck.getTnt1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getTnt2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getTnt3().getMiniIcon()) {
			returnedCard = hatDeck.getTnt1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getFriday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFriday2().getMiniIcon()) {
			returnedCard = weekDeck.getFriday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getMonday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getMonday2().getMiniIcon()) {
			returnedCard = weekDeck.getMonday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getSaturday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSaturday2().getMiniIcon()) {
			returnedCard = weekDeck.getSaturday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getSunday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSunday2().getMiniIcon()) {
			returnedCard = weekDeck.getSunday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getThursday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getThursday2().getMiniIcon()) {
			returnedCard = weekDeck.getThursday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getTuesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getTuesday2().getMiniIcon()) {
			returnedCard = weekDeck.getTuesday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getWednesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getWednesday2().getMiniIcon()) {
			returnedCard = weekDeck.getWednesday1();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getFridayThe131().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFridayThe132().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFridayThe133().getMiniIcon()) {
			returnedCard = weekDeck.getFridayThe131();
			return returnedCard;
		} else if (smallCardToBeConverted == weekDeck.getHoliday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getHoliday2().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getHoliday3().getMiniIcon()) {
			returnedCard = weekDeck.getHoliday1();
			return returnedCard;
		} else {
			return null;
		}
	}

	public boolean checkIfMonsterByHandSlot(JButton button) {
		Icon smallCardToBeConverted = button.getIcon();
		if (smallCardToBeConverted == hatDeck.getBlueHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getBlueHat3().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == hatDeck.getGreenHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getGreenHat3().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == hatDeck.getYellowHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat2().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getYellowHat3().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == hatDeck.getWhiteHat1().getMiniIcon()
				|| smallCardToBeConverted == hatDeck.getWhiteHat2().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == weekDeck.getFriday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getFriday2().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == weekDeck.getMonday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getMonday2().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == weekDeck.getSaturday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSaturday2().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == weekDeck.getSunday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getSunday2().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == weekDeck.getThursday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getThursday2().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == weekDeck.getTuesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getTuesday2().getMiniIcon()) {
			return true;
		} else if (smallCardToBeConverted == weekDeck.getWednesday1().getMiniIcon()
				|| smallCardToBeConverted == weekDeck.getWednesday2().getMiniIcon()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean setHandSlotBooleanToFalseByHandSlotButton(JButton button) {
		if (button == this.playerHand1) {
			this.playerHandSlot1Occupied = false;
			return this.playerHandSlot1Occupied;
		} else if (button == this.playerHand2) {
			this.playerHandSlot2Occupied = false;
			return this.playerHandSlot2Occupied;
		} else if (button == this.playerHand3) {
			this.playerHandSlot3Occupied = false;
			return this.playerHandSlot3Occupied;
		} else if (button == this.playerHand4) {
			this.playerHandSlot4Occupied = false;
			return this.playerHandSlot4Occupied;
		} else if (button == this.playerHand5) {
			this.playerHandSlot5Occupied = false;
			return this.playerHandSlot5Occupied;
		} else if (button == this.playerHand6) {
			this.playerHandSlot6Occupied = false;
			return this.playerHandSlot6Occupied;
		} else if (button == this.playerHand7) {
			this.playerHandSlot7Occupied = false;
			return this.playerHandSlot7Occupied;
		} else if (button == this.playerHand8) {
			this.playerHandSlot8Occupied = false;
			return this.playerHandSlot8Occupied;
		} else if (button == this.playerHand9) {
			this.playerHandSlot9Occupied = false;
			return this.playerHandSlot9Occupied;
		} else if (button == this.playerHand10) {
			this.playerHandSlot10Occupied = false;
			return this.playerHandSlot10Occupied;
		} else if (button == this.playerHand11) {
			this.playerHandSlot11Occupied = false;
			return this.playerHandSlot11Occupied;
		} else if (button == this.playerHand12) {
			this.playerHandSlot12Occupied = false;
			return this.playerHandSlot12Occupied;
		} else if (button == this.playerHand13) {
			this.playerHandSlot13Occupied = false;
			return this.playerHandSlot13Occupied;
		} else if (button == this.playerHand14) {
			this.playerHandSlot14Occupied = false;
			return this.playerHandSlot14Occupied;
		} else if (button == this.playerHand15) {
			this.playerHandSlot15Occupied = false;
			return this.playerHandSlot15Occupied;
		} else if (button == this.playerHand16) {
			this.playerHandSlot16Occupied = false;
			return this.playerHandSlot16Occupied;
		} else if (button == this.playerHand17) {
			this.playerHandSlot17Occupied = false;
			return this.playerHandSlot17Occupied;
		} else if (button == this.playerHand18) {
			this.playerHandSlot18Occupied = false;
			return this.playerHandSlot18Occupied;
		} else if (button == this.playerHand19) {
			this.playerHandSlot19Occupied = false;
			return this.playerHandSlot19Occupied;
		} else if (button == this.playerHand20) {
			this.playerHandSlot20Occupied = false;
			return this.playerHandSlot20Occupied;
		} else {
			return this.opponentHandSlot20Occupied;
		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Refresh BIG CARD on every click
			if (e.getSource() == playerHand1 || e.getSource() == playerHand2 || e.getSource() == playerHand3
					|| e.getSource() == playerHand4 || e.getSource() == playerHand5 || e.getSource() == playerHand6
					|| e.getSource() == playerHand7 || e.getSource() == playerHand8 || e.getSource() == playerHand9
					|| e.getSource() == playerHand10 || e.getSource() == playerHand11 || e.getSource() == playerHand12
					|| e.getSource() == playerHand13 || e.getSource() == playerHand14 || e.getSource() == playerHand15
					|| e.getSource() == playerHand16 || e.getSource() == playerHand17 || e.getSource() == playerHand18
					|| e.getSource() == playerHand19 || e.getSource() == playerHand20 || e.getSource() == opponentHand1
					|| e.getSource() == opponentHand2 || e.getSource() == opponentHand3	|| e.getSource() == opponentHand4
					|| e.getSource() == opponentHand5 || e.getSource() == opponentHand6	|| e.getSource() == opponentHand7
					|| e.getSource() == opponentHand8 || e.getSource() == opponentHand9	|| e.getSource() == opponentHand10
					|| e.getSource() == opponentHand11 || e.getSource() == opponentHand12 || e.getSource() == opponentHand13
					|| e.getSource() == opponentHand14 || e.getSource() == opponentHand15 || e.getSource() == opponentHand16
					|| e.getSource() == opponentHand17 || e.getSource() == opponentHand18 || e.getSource() == opponentHand19
					|| e.getSource() == opponentHand20 || e.getSource() == playerMonsterZone1 || e.getSource() == playerMonsterZone2
					|| e.getSource() == playerMonsterZone3 || e.getSource() == playerSpellZone1  || e.getSource() == playerSpellZone2
					|| e.getSource() == opponentSpellZone3 || e.getSource() == opponentGraveyard || e.getSource() == opponentMonsterZone1
					|| e.getSource() == opponentMonsterZone2 || e.getSource() == opponentMonsterZone3
					|| e.getSource() == opponentSpellZone3 || e.getSource() == opponentGraveyard) {
			JButton clickedButton = (JButton) e.getSource();
			returnBigCardBySmallCard(clickedButton);
			}

			// Card in hand action listener
			if (e.getSource() == playerHand1 || e.getSource() == playerHand2 || e.getSource() == playerHand3
					|| e.getSource() == playerHand4 || e.getSource() == playerHand5 || e.getSource() == playerHand6
					|| e.getSource() == playerHand7 || e.getSource() == playerHand8 || e.getSource() == playerHand9
					|| e.getSource() == playerHand10 || e.getSource() == playerHand11 || e.getSource() == playerHand12
					|| e.getSource() == playerHand13 || e.getSource() == playerHand14 || e.getSource() == playerHand15
					|| e.getSource() == playerHand16 || e.getSource() == playerHand17 || e.getSource() == playerHand18
					|| e.getSource() == playerHand19 || e.getSource() == playerHand20) {
			JButton clickedButton = (JButton) e.getSource();
			String[] monstersOptions = { "Summon", "Cancel" };
			String[] spellOptions = { "Activate", "Cancel" };
			boolean isMonster = this.checkIfMonsterByHandSlot(clickedButton);
			Card object = returnCardObjectByFieldButton(clickedButton);
			if (isMonster) {
				int action = JOptionPane.showOptionDialog(null, "Summon this monster?", object.getName(),
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, monstersOptions, 0);
				if (action == 0) {
					if (clickedButton.getIcon() == hatDeck.getWhiteHat1().getMiniIcon()
							|| clickedButton.getIcon() == hatDeck.getWhiteHat2().getMiniIcon()) {
						if (this.advancedSummon(clickedButton)) {
							clickedButton.setIcon(null);
							clickedButton.setVisible(false);
							setHandSlotBooleanToFalseByHandSlotButton(clickedButton);
						}
					} else if (this.summon(clickedButton)) {
						clickedButton.setIcon(null);
						clickedButton.setVisible(false);
						setHandSlotBooleanToFalseByHandSlotButton(clickedButton);
					}
				}
			} else if (isMonster == false) {
				int action = JOptionPane.showOptionDialog(null, "Activate this card?", object.getName(),
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, spellOptions, 0);
				if (action == 0) {
					//Insert card activation method here
				}
			}

			}
			
			
			if (e.getSource() == nextPhaseButton) {
				this.drawCardPlayer();
				this.drawCardOpponent();
			}

	}
}
