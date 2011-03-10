public class PrivateCalc {
	public static void main(String[] args) {
		int year = 5;
		int monthInput = 5000;
		float zf = 0.008f;
		double count = monthInput;
		for (int i = 1; i < year * 12; i++) {
			count += count * zf + monthInput;
		}
		System.out.println(count);
	}
}
