package cards;

import javax.swing.ImageIcon;

public class YellowHat extends MonsterCard {

	public YellowHat() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("miniyellowhat.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("yellowhat.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(1900);
		this.setDef(1800);
		this.setName("Yellow Hat");
	}
}
