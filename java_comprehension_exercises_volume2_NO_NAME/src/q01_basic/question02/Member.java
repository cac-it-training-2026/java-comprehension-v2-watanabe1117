package q01_basic.question02;

class Member {
	// フィールド
	private String name;
	private int age;
	private int rank;

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// rankUp メソッド
	public void rankUp() {
		rank++;
		System.out.println(">>>RANK UP>>>");
	}

	// showMember メソッド
	public void showMember() {
		System.out.println("---SHOW DATA---");
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}
}
