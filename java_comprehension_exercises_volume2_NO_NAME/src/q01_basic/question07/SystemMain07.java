package q01_basic.question07;

import java.io.IOException;
import java.util.List;

public class SystemMain07 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		NumberList n1 = new NumberList();

		int num = 0;

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		try {
			num = cr.inputNumber();
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}

		// 6.3
		n1.addFromOneTo(num);

		// 6.4
		List<Integer> numbers = n1.getNumbers();
		System.out.println(numbers);

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = n1.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		n1.doubleListEachValue();
		System.out.println(n1.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		n1.removeIndexOfFirstHalf();
		System.out.println(n1.getNumbers());

	}

}
