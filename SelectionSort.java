import java.util.Scanner;

/*Dựa vào so sánh in-place, trong đó danh sách được chia thành hai phần, phần được sắp xếp ở bên trái và phần chưa được sắp xếp ở bên phải
Phần bên trái ban đầu sẽ rỗng. Ta sẽ lấy phần tử nhỏ nhất ở phần bên phải và tráo đổi với phần bên trái nhất.*/

/*Relies on in-place comparison, where the list is divided into two parts, the sorted part on the left and the unsorted part on the right
The left side will initially be empty. We will take the smallest element in the right part and swap it with the left most part.*/

/*Ex: array[1,3,1,7]
    array_left = null; array_right == array
    array_left[1]; array_right = [3,1,7]
    array_left = [1,1]; array_right = [3,7]
    array_left = [1,1,3];  array_right = [7]
    array_left = [1,1,3,7];  array_right = null
*/
public class SelectionSort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++)
            arr[i] = scan.nextInt();

        int index;
        for(int i=0;i<n-1;i++) {
            index = i;
            for(int j=i+1;j<n;j++) {
                if(arr[index]>arr[j]) {
                    index =j;
                }
            }
            if(i!=index) {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}