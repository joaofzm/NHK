package cards;

import javax.swing.ImageIcon;

public class Holiday extends SpellCard {

	public Holiday() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("miniholiday.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("holiday.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setName("Holiday");
	}
}
