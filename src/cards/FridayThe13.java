package cards;

import javax.swing.ImageIcon;

public class FridayThe13 extends SpellCard {

	public FridayThe13() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minifridaythe13th.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("fridaythe13th.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setName("Friday The 13th");
	}

}
