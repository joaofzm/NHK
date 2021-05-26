package cards;

import javax.swing.ImageIcon;

public class Multiply extends SpellCard {

	public Multiply() {
		ImageIcon miniIcon = new ImageIcon(getClass().getClassLoader().getResource("minimultiply.png"));
		ImageIcon bigIcon = new ImageIcon(getClass().getClassLoader().getResource("multiply.png"));
		this.setMiniIcon(miniIcon);
		this.setBigIcon(bigIcon);
		this.setName("Multiply");
	}


}
