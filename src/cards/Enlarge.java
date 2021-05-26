package cards;

import javax.swing.ImageIcon;

public class Enlarge extends SpellCard {

	public Enlarge() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minienlarge.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("enlarge.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setName("Enlarge");
	}

}
