package cards;

import javax.swing.ImageIcon;

public class GreenHat extends MonsterCard {

	public GreenHat() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minigreenhat.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("greenhat.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(1900);
		this.setDef(1800);
		this.setName("Green Hat");
	}

}
