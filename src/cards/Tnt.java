package cards;

import javax.swing.ImageIcon;

public class Tnt extends SpellCard {

	public Tnt() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minitnt.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("tnt.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setName("Tnt");
	}


}
