package Java����50��;

/*
 *  Lawliet.2018.3.25
 */
/*
 * Լɪ������
 */
//��������ʵ��
public class example_37 {
	
	public static class Node{
		public int value;
		public Node next;
		
		public Node(int date){
			this.value = date;
		}
	}
	
	//mΪ�������֣�ԭ���� m = 3 �� �������û�б�ɱ���Ľ��
	public static Node josephusKill (Node head, int m){
		if(head == null || head.next == head || m < 1){
			return head;
		}
		Node last = head;
		//last�ߵ�ͷ����ǰ��һ��
		while(last.next != head){
			last = last.next;
		}
		int count = 0;
		while(head != last){
			if(++count == m){
				last.next = head.next;
				count = 0;
			}else{
				last = last.next;
			}
			head = last.next;
		}
		return head;
	}
	
	public static void main(String[] args){
		//ԭ����41���ˣ�����3����ɱ��������10����㣬����3��ɱ������
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		node10.next = node1;
		Node alive = new Node(0);
		alive = josephusKill(node1, 3);
		System.out.println("�������������" + alive.value +"��");
	}
	
}
