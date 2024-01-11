import java.util.Scanner;

//Giải thuật sắp xếp đơn giản nhất, không phù hợp với tập dữ liệu lớn (0(n^2))
//So sánh các cắp phần tử liền kề và tráo đổi chúng nếu không theo thứ tự

//The simplest sorting algorithm, not suitable for large data sets (0(n^2))
//Compare adjacent elements and swap them if out of order
public class BubbleSort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++)
            arr[i] = scan.nextInt();

        for(int i=n-1;i>=1;i--) {
            boolean check = true; //giảm sự tráo đổi khi mảng này đã được sắp xếp
            for(int j=0;j<i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check=false;
                }
            }
            if(check) {
                break;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
