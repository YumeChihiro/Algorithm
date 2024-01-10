import java.util.Scanner;

/*Dựa trên InsertionSort, nhưng tránh trường hợp với hoán đổi vị trí các phần tử ở vị trí cách xa nhau.
Đầu tiên nó chia mảng thành 2 nữa (n/2) và lấy phần tử đầu tiên của nữa 1 so sánh với phần tử đầu tiên của nữa 2, tăng lên một sau mỗi lần so sánh.
Khi đã so sánh hết các phần tử, giải thuật này tiếp tục chia mảng thành các phần nhỏ hơn (n/2/2).
Khi interval = 1, ta sẽ áp dụng sắp xếp chèn với cả mảng*/

/*Based on InsertionSort, but avoids the case with transposing elements that are far apart.
First it divides the array into 2 halves (n/2) and takes the first element of halves 1 and compares them with the first element of halves 2, increasing by one after each comparison.
Once all the elements have been compared, this algorithm continues to divide the array into smaller parts (n/2/2).
When interval = 1, we will apply insertion sort to the entire array*/
public class ShellSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int [n];
        for(int i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }
        sc.close();
        for(int interval = n/2;interval>0;interval/=2) {
            for(int i=interval;i<n;i++) {
                int temp = array[i];
                int j =i;
                while(j>=interval && array[j-interval]>temp) {
                    array[j]=array[j-interval];
                    j-=interval;
                }
                array[j]=temp;
            }
        }
        for(int i =0;i<n;i++) {
            System.out.print(array[i]+" ");
        }
    }
}