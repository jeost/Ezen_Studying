package Day19;

import java.util.HashMap;

public class Day19_3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("�ſ��", 85); System.out.println("Ȯ�� : " + map);
		
		map.put("ȫ�浿", 90); System.out.println("Ȯ�� : " + map);
		map.put("���屺", 80); System.out.println("Ȯ�� : " + map);
		map.put("ȫ�浿", 95); System.out.println("Ȯ�� : " + map);
		map.put("���缮", 95); System.out.println("Ȯ�� : " + map);
		
		System.out.println("map��ü�� entry �� : "+ map.size());
		// keyȣ��� �� ȣ��
		System.out.println("map��ü�� �� ȣ�� : "+map.get("���缮"));
		
		System.out.println("map ��ü�� ��� Ű ȣ�� : " +map.keySet());
		
		System.out.println("map ��ü�� ��� �� ȣ�� : " + map.values());
		//�ݺ���
		for(String temp : map.keySet()) {
			System.out.println(temp+":"+map.get(temp));
		}
		
		//����
		map.remove("ȫ�浿"); System.out.println("Ȯ��" + map);
		
		map.clear(); System.out.println("Ȯ��" + map);
	}
}
