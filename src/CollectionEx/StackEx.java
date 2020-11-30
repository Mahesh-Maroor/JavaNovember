package CollectionEx;

import java.util.Stack;

public class StackEx {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push("mahesh");
	s.push("vijay");
	s.push("karim");
	s.push("sameer");
	System.out.println(s.peek());
	System.out.println(s.search("karim"));
	}
}
