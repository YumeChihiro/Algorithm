import java.util.Scanner;
import java.util.Stack;

//LIFO: Last in first out
public class StackStructure{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++) {
            stack.push(s.charAt(i));
        }
        while(!stack.empty()) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}

