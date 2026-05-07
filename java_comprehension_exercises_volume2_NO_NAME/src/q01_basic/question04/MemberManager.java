package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	// 全件表示（static）
	public static void showAllMembers(Member[] members) {

		System.out.println("---SHOW ALL MEMBERS---");

		for (Member m : members) {
			m.showMember();
		}
	}

}
