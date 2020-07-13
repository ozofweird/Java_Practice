package mapPractice1;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	// Key�� ȸ����ȣ, Value�� Member
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}
	
	public void showInfo() {

		// keySet�� ��� ��� Set ��ü�� �ѹ��� ��ȯ, Key�� �ߺ����� �ʱ⶧���� set Type���� ��ȯ
		// values�� ��� ��� Value�� ��ȯ������ �ߺ��� �� �ֱ� ������ collection Type���� ��ȯ
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
