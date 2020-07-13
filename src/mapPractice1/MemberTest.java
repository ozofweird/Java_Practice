package mapPractice1;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member lee = new Member(100, "Lee");
		Member kim = new Member(200, "Kim");
		Member ahn = new Member(300, "Ahn");
		Member ahn2 = new Member(300, "Ahn2");
		
		MemberHashMap hashMap = new MemberHashMap();
		hashMap.addMember(lee);
		hashMap.addMember(kim);
		hashMap.addMember(ahn);
		hashMap.addMember(ahn2);
		hashMap.showInfo();
		
		System.out.println();
		
		hashMap.removeMember(200);
		hashMap.showInfo();
	}

}
