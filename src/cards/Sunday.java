package cards;

import javax.swing.ImageIcon;

public class Sunday extends MonsterCard {

	public Sunday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minisunday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("sunday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(1000);
		this.setDef(1000);
		this.setName("Sunday");
	}

}
