package tungdo.mlinkedlist;

import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void test(){
		MyLinkedList<Integer> integerList = new MyLinkedList<>();
		integerList.appendFirst(10);
		integerList.appendFirst(20);
		integerList.appendFirst(40);
		integerList.appendFirst(30);
		integerList.appendLast(50);
		integerList.appendLast(15);
		System.out.println("List integer: ");
		System.out.println(integerList);
		integerList.removeAt(5);
		System.out.println("Remove element at index 5:");
		System.out.println(integerList);
		integerList.removeAll(35);
		System.out.println("Remove element greater than 35:");
		System.out.println(integerList);
		//
		MyLinkedList<String> stringList = new MyLinkedList<>();
		stringList.appendFirst("A");
		stringList.appendFirst("B");
		stringList.appendFirst("C");
		stringList.appendFirst("D");
		stringList.appendLast("E");
		stringList.appendLast("F");
		System.out.println("List string: ");
		System.out.println(stringList);
		stringList.removeAt(5);
		System.out.println("Remove element at index 5:");
		System.out.println(stringList);
		stringList.removeAll("C");
		System.out.println("Remove element greater than C");
		System.out.println(stringList);
	}
}
