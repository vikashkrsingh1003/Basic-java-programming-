// WAP TO sort assending order?

public class A15 {
    public static void main(String[] args) {
        int arr[] = {30,10,20};
        System.out.println("Before Shorting ");
        for(int i=0; i<arr.length;i++){
            System.out.println("\t"+ arr[i]);
        }
        // bubble sort logic 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length ; j++){
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }  System.out.println("after Shorting ");
        for(int i=0; i<arr.length;i++){
            System.out.println("\t"+ arr[i]);
    }
}
}
