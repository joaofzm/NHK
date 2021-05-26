package cards;

import javax.swing.ImageIcon;

public abstract class Card {

	private String name;
	private ImageIcon miniIcon;
	private ImageIcon BigIcon;
	private int id;
	private int state; // 0- Deck 1- Hand 2-MZ1 3-MZ2 4-MZ3 5-SZ1 6-SZ2 7-SZ3 8-GY

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ImageIcon getMiniIcon() {
		return miniIcon;
	}

	public void setMiniIcon(ImageIcon miniIcon) {
		this.miniIcon = miniIcon;
	}

	public ImageIcon getBigIcon() {
		return BigIcon;
	}

	public void setBigIcon(ImageIcon bigIcon) {
		BigIcon = bigIcon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
