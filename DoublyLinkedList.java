import java.util.*;

/*Là một tập hợp Node phân bố động
*Mỗi Node gồm một giá trị (Data) và một con trỏ (Next)
*Con trỏ sẽ trỏ đến phần tử kế tiếp trong danh sách
*Con trỏ Null chính là phần tử cuối cùng */

//Java không có khái niệm con trỏ, thay vào đó, sử dụng tham chiếu
public class DoublyLinkedList {
    public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            linkedlist.offer(scan.nextInt());
        }
        scan.close();
        for (int j : linkedlist){
            System.out.print(j + " ");
        }
    }
}