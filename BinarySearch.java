import java.util.Scanner;


//Độ phức tạp O (log n). Dựa trên nguên tắc chia để trị (Divide and Conquer)
/* So sánh phần tử cần tìm với phần tử ở giữa của tập dữ liệu. Nếu phần tử cần tìm
lớn hơn thì kết quả nằm ở mảng con bên phải và ngược lại */

//Complexity O(log n). Based on the principle of Divide and Conquer
/* Compare the element to find with the middle element of the data set. If the element to find
larger, the result will be in the right subarray and vice versa */

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int [100];
        for(int i=0;i<n;i++) {
            array[i]=sc.nextInt();
            sc.nextLine();
        }
        int x= sc.nextInt();
        int l=0;
        int r=n-1;
        while(l<r) {
            int mid=(l+r)/2;
            if(array[mid]<x) {
                l = mid+1;
            }else {
                r=mid;
            }
        }
        if(array[l]==x) {
            System.out.print(l);
        }else {
            System.out.print(-1);
        }
    }
}
