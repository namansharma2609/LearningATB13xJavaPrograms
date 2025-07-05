package ex_02_JavaBasics;

public class Second_Largest_Number {
    public static void main(String[] args) {
        int a[] = {12,23,43,45,34,89};
        int temp,size;
        size = a.length;

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j <size ; j++) {
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
            System.out.println(a);
        }
//        System.out.println(a[size-2]);


    }
}
