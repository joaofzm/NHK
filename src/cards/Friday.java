package cards;

import javax.swing.ImageIcon;

public class Friday extends MonsterCard {

	public Friday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minifriday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("friday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setAtk(2900);
		this.setDef(2900);
		this.setName("Friday");
	}
}
