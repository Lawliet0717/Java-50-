package Java基础50题;

/*
 *  Lawliet.2018.3.25
 */
/*
 * 约瑟夫问题
 */
//环形链表实现
public class example_37 {
	
	public static class Node{
		public int value;
		public Node next;
		
		public Node(int date){
			this.value = date;
		}
	}
	
	//m为报的数字，原题中 m = 3 ， 返回最后没有被杀死的结点
	public static Node josephusKill (Node head, int m){
		if(head == null || head.next == head || m < 1){
			return head;
		}
		Node last = head;
		//last走到头结点的前面一个
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
		//原题有41个人，报到3的自杀，这里用10个结点，报到3自杀作测试
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
		System.out.println("存活下来的人是" + alive.value +"号");
	}
	
}
