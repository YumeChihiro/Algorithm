import java.util.Scanner;

//Giải thuật sắp xếp đơn giản nhất
//So sánh các cắp phần tử liền kề
public class BubbleSort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++)
            arr[i] = scan.nextInt();

        for(int i=n-1;i>=1;i--) {
            boolean check = false;
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