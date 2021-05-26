package cards;

import javax.swing.ImageIcon;

public class Tuesday extends MonsterCard {

	public Tuesday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minituesday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("tuesday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(500);
		this.setDef(1800);
		this.setName("Tuesday");
	}

}
