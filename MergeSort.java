import java.util.Scanner;

public class MergeSort{
    public static void merge(int array[],int l,int m,int r) {
        int n_l = m-l+1;
        int n_r = r-m;
        int array_l[] = new int [n_l];
        int array_r[] = new int [n_r];

        for(int i=0;i<n_l;i++) {
            array_l[i]=array[l+i];
        }
        for(int i=0;i<n_r;i++) {
            array_r[i]=array[m+1+i];
        }

        int i=0;int j=0;int k=l;
        while(i<n_l && j<n_r) {
            if(array_l[i] <= array_r[j]) {
                array[k]=array_l[i];
                i++;
            }else {
                array[k]=array_r[j];
                j++;
            }
            k++;
        }
        while(i<n_l) {
            array[k]=array_l[i];
            i++;k++;
        }
        while(j<n_r) {
            array[k]=array_r[j];
            j++;k++;
        }
    }

    public static void mergeSort(int array[], int l, int r) {
        if(l<r) {
            int mid = (l+r)/2;
            mergeSort(array, l, mid);
            mergeSort(array, mid+1, r);
            merge(array, l, mid, r);
        }
    }

    public static void print(int array[]) {
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int array[] = new int[n];
        int i=0;
        while(i<n) {
            array[i]=sc.nextInt();
            i++;
        }
        mergeSort(array, 0, n-1);
        print(array);
    }
}