package cards;

import javax.swing.ImageIcon;

public class Monday extends MonsterCard {

	public Monday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minimonday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("monday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(0);
		this.setDef(2800);
		this.setName("Monday");
	}

}
