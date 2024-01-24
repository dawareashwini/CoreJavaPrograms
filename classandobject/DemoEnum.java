package classandobject;

public class DemoEnum {
	public enum Day {
		MONDAY(0), TUESDAY(1), WENESDAY(2), THUSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);

		private int dayIndex;

		Day(int index) {
			this.setDayIndex(index);
		}

		public int getDayIndex() {
			return dayIndex;
		}

		public void setDayIndex(int dayIndex) {
			this.dayIndex = dayIndex;
		}
	}

	/*
	 * public int getDayIndex() { return dayIndex; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Day.MONDAY);
		System.out.println(Day.MONDAY.getDayIndex());
	}

}
