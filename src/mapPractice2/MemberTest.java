package mapPractice2;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member lee = new Member(100, "Lee");
		Member kim = new Member(200, "Kim");
		Member ahn = new Member(300, "Ahn");
		Member ahn2 = new Member(300, "Ahn2");
		
		MemberTreeMap treeMap = new MemberTreeMap();
		treeMap.addMember(lee);
		treeMap.addMember(kim);
		treeMap.addMember(ahn);
		treeMap.addMember(ahn2);
		treeMap.showInfo();
		
		System.out.println();
		
		treeMap.removeMember(200);
		treeMap.showInfo();
	}

}
