package cards;

import java.util.ArrayList;
import java.util.Collections;

public class HatDeck {
	
	BlueHat blueHat1;
	BlueHat blueHat2;
	BlueHat blueHat3;
	GreenHat greenHat1;
	GreenHat greenHat2;
	GreenHat greenHat3;
	YellowHat yellowHat1;
	YellowHat yellowHat2;
	YellowHat yellowHat3;
	WhiteHat whiteHat1;
	WhiteHat whiteHat2;
	Enlarge enlarge1;
	Enlarge enlarge2;
	Enlarge enlarge3;
	Multiply multiply1;
	Multiply multiply2;
	Multiply multiply3;
	Tnt tnt1;
	Tnt tnt2;
	Tnt tnt3;
	ArrayList<Integer> hatDeckArrayList;


	public HatDeck() {
		blueHat1 = new BlueHat();
		blueHat1.setId(1);

		blueHat2 = new BlueHat();
		blueHat2.setId(2);

		blueHat3 = new BlueHat();
		blueHat3.setId(3);

		greenHat1 = new GreenHat();
		greenHat1.setId(4);

		greenHat2 = new GreenHat();
		greenHat2.setId(5);

		greenHat3 = new GreenHat();
		greenHat3.setId(6);

		yellowHat1 = new YellowHat();
		yellowHat1.setId(7);

		yellowHat2 = new YellowHat();
		yellowHat2.setId(8);

		yellowHat3 = new YellowHat();
		yellowHat3.setId(9);

		whiteHat1 = new WhiteHat();
		whiteHat1.setId(10);

		whiteHat2 = new WhiteHat();
		whiteHat2.setId(11);

		enlarge1 = new Enlarge();
		enlarge1.setId(12);

		enlarge2 = new Enlarge();
		enlarge2.setId(13);

		enlarge3 = new Enlarge();
		enlarge3.setId(14);

		multiply1 = new Multiply();
		multiply1.setId(15);

		multiply2 = new Multiply();
		multiply2.setId(16);

		multiply3 = new Multiply();
		multiply3.setId(17);

		tnt1 = new Tnt();
		tnt1.setId(18);

		tnt2 = new Tnt();
		tnt2.setId(19);

		tnt3 = new Tnt();
		tnt3.setId(20);
		
		hatDeckArrayList = new ArrayList<Integer>();
		hatDeckArrayList.add(1);
		hatDeckArrayList.add(2);
		hatDeckArrayList.add(3);
		hatDeckArrayList.add(4);
		hatDeckArrayList.add(5);
		hatDeckArrayList.add(6);
		hatDeckArrayList.add(7);
		hatDeckArrayList.add(8);
		hatDeckArrayList.add(9);
		hatDeckArrayList.add(10);
		hatDeckArrayList.add(11);
		hatDeckArrayList.add(12);
		hatDeckArrayList.add(13);
		hatDeckArrayList.add(14);
		hatDeckArrayList.add(15);
		hatDeckArrayList.add(16);
		hatDeckArrayList.add(17);
		hatDeckArrayList.add(18);
		hatDeckArrayList.add(19);
		hatDeckArrayList.add(20);
		Collections.shuffle(hatDeckArrayList);

	}


	public ArrayList<Integer> getHatDeckArrayList() {
		return hatDeckArrayList;
	}

	public void removeFirstElementFromHatDeckArrayList() {
		this.hatDeckArrayList.remove(0);
	}

	public BlueHat getBlueHat1() {
		return blueHat1;
	}

	public BlueHat getBlueHat2() {
		return blueHat2;
	}

	public BlueHat getBlueHat3() {
		return blueHat3;
	}

	public GreenHat getGreenHat1() {
		return greenHat1;
	}

	public GreenHat getGreenHat2() {
		return greenHat2;
	}

	public GreenHat getGreenHat3() {
		return greenHat3;
	}

	public YellowHat getYellowHat1() {
		return yellowHat1;
	}

	public YellowHat getYellowHat2() {
		return yellowHat2;
	}

	public YellowHat getYellowHat3() {
		return yellowHat3;
	}

	public WhiteHat getWhiteHat1() {
		return whiteHat1;
	}

	public WhiteHat getWhiteHat2() {
		return whiteHat2;
	}

	public Enlarge getEnlarge1() {
		return enlarge1;
	}

	public Enlarge getEnlarge2() {
		return enlarge2;
	}

	public Enlarge getEnlarge3() {
		return enlarge3;
	}

	public Multiply getMultiply1() {
		return multiply1;
	}

	public Multiply getMultiply2() {
		return multiply2;
	}

	public Multiply getMultiply3() {
		return multiply3;
	}

	public Tnt getTnt1() {
		return tnt1;
	}

	public Tnt getTnt2() {
		return tnt2;
	}

	public Tnt getTnt3() {
		return tnt3;
	}

}
