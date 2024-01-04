import java.util.Scanner;

//Linear Search: giải thuật tìm kiếm cơ bản. Hoạt động tìm kiếm diễn ra qua tất cả các phần tử
//Linear Search: Basic search algorithm. The search operation takes place across all elements
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int array[] = new int [100];
        for(int i=0;i<n;i++) {
            array[i]=sc.nextInt();
            sc.nextLine();
        }
        int x=sc.nextInt();
        sc.close();
        boolean find=false;
        for(int i=0;i<n;i++) {
            if(array[i]==x) {
                System.out.print(i);
                find=true;
                break;
            }
        }
        if(!find) {
            System.out.print("-1");
        }

    }
}