package cards;

import javax.swing.ImageIcon;

public class WhiteHat extends MonsterCard {

	public WhiteHat() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("miniwhitehat.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("whitehat.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(3000);
		this.setDef(2500);
		this.setName("White Hat");
	}

}
