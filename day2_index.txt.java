package koreait.day02;

public class C03_IntegerData {

	public static void main(String[] args) {
		
		System.out.println("Short ���� ������---------------");
		System.out.println("�޸� ũ�� : " + Short.BYTES + " ����Ʈ"); // 
		System.out.println("short ������ �ּҰ� : " + Short.MIN_VALUE);
		System.out.println("short ������ �ִ밪 : " + Short.MAX_VALUE);
		
		System.out.println("Integer ���� ������---------------");
		System.out.println("�޸� ũ�� : " + Integer.BYTES + " ����Ʈ"); // 
		System.out.println("Integer ������ �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("Integer ������ �ִ밪 : " + Integer.MAX_VALUE);
		

	}

}

/* ���� ������ �⺻ ������  byte, short, int, long 4���� �̸� 
 * 				�� ���� �޸𸮿� �Ҵ�޴� ũ��(����Ʈ ����)�� �׿� ���� ���� ���� ������ �����˴ϴ�.
 *  			�� ������ ����� �� �� Ű���� (����� : ����� ������ �뵵�� ������ �ܾ�)
 * Byte, Short, Integer, Long Ŭ������ ���� ������ ���ĸ� �ٷ�� �Ӽ��� �޼ҵ带 ���� Ŭ�����Դϴ�.(Wrapper ���� Ŭ����)
 *		�� ������ �� Ŭ�������� ��������� �Ӽ�(�ʵ�)�� �� ������ �ʴ°�(���) �Դϴ�. ��ü�� �빮�ڷ� ǥ���մϴ�.
			�� BYTES, MIN_VALUE, MAX_VALUE
			
 *			��123, 200 ���ͷ��� int(4����Ʈ) �����Դϴ�.��			
 */


