package cards;

import javax.swing.ImageIcon;

public class Wednesday extends MonsterCard {

	public Wednesday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("miniwednesday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("wednesday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(1800);
		this.setDef(1800);
		this.setName("Wednesday");
	}

}
