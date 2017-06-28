package tungdo.mlinkedlist;

import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void test(){
		MyLinkedList list = new MyLinkedList();
		list.appendFirst(10);
		list.appendFirst(20);
		list.appendFirst(40);
		list.appendFirst(30);
		list.appendLast(50);
		list.appendLast(15);
		System.out.println(list);
		list.removeAt(5);
		System.out.println(list);
		list.removeAll(35);
		System.out.println(list);
	}
}
