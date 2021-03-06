public class SwitchTest {
	public static void main(String[] args) {
		SwitchTest switchTest = new SwitchTest();
		System.out.println(switchTest.chooseNear(2));
		System.out.println(switchTest.chooseFar(2));

		System.out.println("0#".hashCode());
		System.out.println(".a".hashCode());
		System.out.println(switchTest.chooseString("0#"));
		System.out.println(switchTest.chooseString(".a"));
	}

	int chooseNear(int i) {
		switch (i) {
		case 0:
			return 0;
		default:
			return -1;
		case 2:
			return 2;
		case 1:
			return 1;
		}
	}

	int chooseFar(int i) {
		switch (i) {
		case -100:
			return -1;
		case 100:
			return 1;
		default:
			return -1;
		case 0:
			return 0;
		}
	}

	long chooseString(String i) {
		switch (i) {
		case "0#":
			return 0;
		default:
			return -1;
		case ".a":
			return 2;
		case "1":
			return 1;
		}
	}
}
