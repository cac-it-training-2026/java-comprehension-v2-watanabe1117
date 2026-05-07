package q01_basic.question05;

public class MemberManager {

	// インスタンス化禁止
	private MemberManager() {
	}

	// 全会員表示
	public static void showAllMembers(AbstMember[] members) {
		System.out.println("---SHOW MEMBERS---");
		for (AbstMember m : members) {
			m.showMember();
		}
	}

}
