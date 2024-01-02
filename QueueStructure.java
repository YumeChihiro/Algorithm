import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//FIFO: First in first out
public class QueueStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            queue.add(sc.nextInt());
            sc.nextLine();
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++) {
            queue.add(queue.poll());
        }
        for(int i=0;i<n;i++) {
            System.out.print(queue.poll()+" ");
        }
        sc.close();
    }
}

