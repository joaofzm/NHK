package cards;

public abstract class SpellCard extends Card {

	public boolean activate() {
		return true;
	}

	public boolean equip() {
		return true;
	}

	public boolean specialSummon() {
		return true;
	}
}
