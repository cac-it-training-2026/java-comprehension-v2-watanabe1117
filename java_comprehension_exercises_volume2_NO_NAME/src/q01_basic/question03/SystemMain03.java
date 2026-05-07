package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		// 6.1 引数なしコンストラクタ
		Member member1 = new Member();

		// 6.2 引数ありコンストラクタ
		Member member2 = new Member("Miura Manabu", 28, 2);

		// 6.3 showMember 呼び出し

		System.out.println("---SHOW DATA(NULL)---");
		member1.showMember();

		System.out.println("---SHOW DATA(Miura)---");
		member2.showMember();
	}

}
