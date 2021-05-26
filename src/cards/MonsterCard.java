package cards;

public abstract class MonsterCard extends Card {

	private int atk;
	private int def;
	private boolean attacked = false;

	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}


	public boolean getAttacked() {
		return attacked;
	}
	public void setAttacked(boolean attacked) {
		this.attacked = attacked;
	}



	public boolean attack(int hp) {
		hp -= this.getAtk();
		return true;
	}

	public boolean attack(MonsterCard monster) {
		if (this.getAtk() > monster.getAtk()) {
			monster.destroyed();
			this.setAttacked(true);
			return true;
		} else if (this.getAtk() == monster.getAtk()) {
			this.destroyed();
			monster.destroyed();
			this.setAttacked(true);
			return true;
		} else if (this.getAtk() < monster.getAtk()) {
			this.destroyed();
			this.setAttacked(true);
			return true;
		} else {
			return false;
		}
	}


	public boolean destroyed() {
		return true;
	}

	public boolean summon() {
		return true;
	}

	public boolean switchPosition() {
		return true;
	}


}
