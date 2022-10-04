import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner6;
import javax.xml.stream.events.StartElement;

public class CeilingNumber{
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
System.out.println(Binary(arr, 15));
    }

    // Return the smallest number grester than or equal to target
static int Binary(int arr[],int target){
        int start=0; int end= arr.length;
        int mid=0;
        while(start<=end){
             mid= start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
                
            }else {
                
                return mid;
            }  
        }
            return start;
}
}