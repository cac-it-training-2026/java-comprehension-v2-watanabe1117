package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];

		// NonMember
		members[0] = new NonMember("Sato Kensuke");

		// Member
		members[1] = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		// 表示
		MemberManager.showAllMembers(members);

		// 購入処理
		System.out.println("---BUY ITEM---");
		for (AbstMember m : members) {
			m.buyItem();
		}
	}

}
