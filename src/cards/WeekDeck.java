package cards;

import java.util.ArrayList;
import java.util.Collections;

public class WeekDeck {

	Friday friday1;
	Friday friday2;
	Monday monday1;
	Monday monday2;
	Saturday saturday1;
	Saturday saturday2;
	Sunday sunday1;
	Sunday sunday2;
	Thursday thursday1;
	Thursday thursday2;
	Tuesday tuesday1;
	Tuesday tuesday2;
	Wednesday wednesday1;
	Wednesday wednesday2;
	FridayThe13 fridayThe131;
	FridayThe13 fridayThe132;
	FridayThe13 fridayThe133;
	Holiday holiday1;
	Holiday holiday2;
	Holiday holiday3;

	ArrayList<Integer> weekDeckArrayList;

	public WeekDeck() {
		friday1 = new Friday();
		friday1.setId(21);

		friday2 = new Friday();
		friday2.setId(22);

		monday1 = new Monday();
		monday1.setId(23);

		monday2 = new Monday();
		monday2.setId(24);

		saturday1 = new Saturday();
		saturday1.setId(25);

		saturday2 = new Saturday();
		saturday2.setId(26);

		sunday1 = new Sunday();
		sunday1.setId(27);

		sunday2 = new Sunday();
		sunday2.setId(28);

		thursday1 = new Thursday();
		thursday1.setId(29);

		thursday2 = new Thursday();
		thursday2.setId(30);

		tuesday1 = new Tuesday();
		tuesday1.setId(31);

		tuesday2 = new Tuesday();
		tuesday2.setId(32);

		wednesday1 = new Wednesday();
		wednesday1.setId(33);

		wednesday2 = new Wednesday();
		wednesday2.setId(34);

		fridayThe131 = new FridayThe13();
		fridayThe131.setId(35);

		fridayThe132 = new FridayThe13();
		fridayThe132.setId(36);

		fridayThe133 = new FridayThe13();
		fridayThe133.setId(37);

		holiday1 = new Holiday();
		holiday1.setId(38);

		holiday2 = new Holiday();
		holiday2.setId(39);

		holiday3 = new Holiday();
		holiday3.setId(40);

		weekDeckArrayList = new ArrayList<Integer>();
		weekDeckArrayList.add(21);
		weekDeckArrayList.add(22);
		weekDeckArrayList.add(23);
		weekDeckArrayList.add(24);
		weekDeckArrayList.add(25);
		weekDeckArrayList.add(26);
		weekDeckArrayList.add(27);
		weekDeckArrayList.add(28);
		weekDeckArrayList.add(29);
		weekDeckArrayList.add(30);
		weekDeckArrayList.add(31);
		weekDeckArrayList.add(32);
		weekDeckArrayList.add(33);
		weekDeckArrayList.add(34);
		weekDeckArrayList.add(35);
		weekDeckArrayList.add(36);
		weekDeckArrayList.add(37);
		weekDeckArrayList.add(38);
		weekDeckArrayList.add(39);
		weekDeckArrayList.add(40);
		Collections.shuffle(weekDeckArrayList);

	}

	public ArrayList<Integer> getWeekDeckArrayList() {
		return weekDeckArrayList;
	}

	public void removeFirstElementFromWeekDeckArrayList() {
		this.weekDeckArrayList.remove(0);
	}

	public Friday getFriday1() {
		return friday1;
	}

	public Friday getFriday2() {
		return friday2;
	}

	public Monday getMonday1() {
		return monday1;
	}

	public Monday getMonday2() {
		return monday2;
	}

	public Saturday getSaturday1() {
		return saturday1;
	}

	public Saturday getSaturday2() {
		return saturday2;
	}

	public Sunday getSunday1() {
		return sunday1;
	}

	public Sunday getSunday2() {
		return sunday2;
	}

	public Thursday getThursday1() {
		return thursday1;
	}

	public Thursday getThursday2() {
		return thursday2;
	}

	public Tuesday getTuesday1() {
		return tuesday1;
	}

	public Tuesday getTuesday2() {
		return tuesday2;
	}

	public Wednesday getWednesday1() {
		return wednesday1;
	}

	public Wednesday getWednesday2() {
		return wednesday2;
	}

	public FridayThe13 getFridayThe131() {
		return fridayThe131;
	}

	public FridayThe13 getFridayThe132() {
		return fridayThe132;
	}

	public FridayThe13 getFridayThe133() {
		return fridayThe133;
	}

	public Holiday getHoliday1() {
		return holiday1;
	}

	public Holiday getHoliday2() {
		return holiday2;
	}

	public Holiday getHoliday3() {
		return holiday3;
	}


}
