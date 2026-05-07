package q01_basic.question05;

public class NonMember extends AbstMember {
	public NonMember(String name) {
		this.name = name;
	}

	// 商品購入
	@Override
	public void buyItem() {
		System.out.println(name + " purchased the item at a fixed price");
	}

	// 情報表示
	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(name + " is a non-member");
		System.out.println("*****************");
	}

}
