import java.util.Scanner;

/* Dựa trên so sánh in-place. Một danh sách con luôn được duy trì và dưới dạng đã qua sắp xếp (phần tử đầu của mảng con là array[0].
* Sắp xếp chèn là thêm một phần tử vào danh sách con đã sắp xếp (so sánh array[1] và array[1])
* Không thích hợp với các tập dữ dữ liệu lớn khi độ phức tạp trường hợp xấu nhất và trường hợp trung bình là Ο(n2) với n là số phần tử. */

/* Based on in-place comparison. A sublist is always maintained in sorted form (the first element of the subarray is array[0].
 * Insertion sort is adding an element to a sorted sublist (compare array[1] and array[1])
 * Not suitable for large data sets where the worst case and average case complexity is Ο(n2) where n is the number of elements. */
public class InsertionSort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++)
            arr[i] = scan.nextInt();

        for(int i=1;i<n;i++) {
            int index = i;
            int value = arr[i];
            while(index>0 && arr[index-1] > value) {
                arr[index]=arr[index-1];
                index--;
            }
            arr[index]=value;
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}