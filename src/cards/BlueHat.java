package cards;

import javax.swing.ImageIcon;

public class BlueHat extends MonsterCard {

	public BlueHat() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minibluehat.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("bluehat.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(2000);
		this.setDef(100);
		this.setName("Blue Hat");
	}

}
