package collectionPractice2;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member lee = new Member(300, "Lee");
		Member kim = new Member(100, "Kim");
		Member ahn = new Member(200, "Ahn");
		
		MemberTreeSet manager = new MemberTreeSet();
		manager.addMember(lee);
		manager.addMember(kim);
		manager.addMember(ahn);
		
		manager.showInfo();
	}

}
