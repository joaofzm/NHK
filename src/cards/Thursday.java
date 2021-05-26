package cards;

import javax.swing.ImageIcon;

public class Thursday extends MonsterCard {

	public Thursday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minithursday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("thursday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(1900);
		this.setDef(1500);
		this.setName("Thursday");
	}

}
