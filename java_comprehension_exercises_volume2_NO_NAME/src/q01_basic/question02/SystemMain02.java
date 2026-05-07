package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		// 5.1 オブジェクト生成
		Member member = new Member();

		// 5.2 setterで値代入
		member.setName("Miura Manabu");
		member.setAge(30);
		member.setRank(1);

		// 5.3 データ表示
		member.showMember();

		// 5.4 ランクアップ
		member.rankUp();

		// 5.5 ランク取得・表示
		System.out.println("---GET RANK---");
		System.out.println("newRank:" + member.getRank());

	}
}
