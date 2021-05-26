package cards;

import javax.swing.ImageIcon;

public class Saturday extends MonsterCard {

	public Saturday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minisaturday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("saturday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(2900);
		this.setDef(2900);
		this.setName("Saturday");
	}

}
