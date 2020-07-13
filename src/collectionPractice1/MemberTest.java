package collectionPractice1;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member lee = new Member(100, "Lee");
		Member kim = new Member(200, "Kim");
		Member ahn = new Member(300, "Ahn");
		Member ahn2 = new Member(300, "Ahn2");
		
		MemberHashSet manager = new MemberHashSet();
		manager.addMember(lee);
		manager.addMember(kim);
		manager.addMember(ahn);
		manager.addMember(ahn2);
		
		manager.showInfo();
		
		manager.removeMember(100);
		manager.showInfo();
	}

}
 