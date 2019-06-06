package com.challa.codeahead1.array;

/*Find bitonic point in given bitonic sequence
 * if a[mid-1]<a[mid] && a[mid]>a[mid+1]  a[mid] is bitonic point
 * if a[mid]< a[mid+1] the search for the right side .
 */
public class BitonicArray {

    public static void main(String[] args) {
       int arr[]= {-3,5,7,10,6,4,1};
       System.out.println(bitonicPoint(arr));
    }
    
   public static int bitonicPoint(int arr[]) {
       int l=0;
       int h=arr.length-1;
       while(l<=h) {
           int mid=(l+h)/2;
           if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
               return mid;
           }
           if(arr[mid]<arr[mid+1]) {
               l=mid+1;
           }else {
              h=mid-1; 
           }
       }
       return -1;
   }
   /* public int bitonicSearch(int arr[],int searchElement) {
        int low=0, high=arr.length;
    } */
    private static int ascendingBinarySearch(int a[], int srchVal){
        int lb = 0;
        int ub = a.length - 1;

        while(lb <= ub){
            int mid = (lb + ub)/2;
            if(a[mid] == srchVal){
                return mid;
            }
            else if(srchVal > a[mid]){
                lb = mid + 1;
            }
            else{
                ub = mid - 1;
            }
         }
        return -1;
    }
    
    private static int descendingBinarySearch(int a[], int srchVal){
        int lb = 0;
        int ub = a.length - 1;

        while(lb <= ub){
            int mid = (lb + ub)/2;
            if(a[mid] == srchVal){
                return mid;
            }
            else if(srchVal < a[mid]){
                lb = mid + 1;
            }
            else{
                ub = mid - 1;
            }
         }
        return -1;
    }
}
