import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner6;
import javax.xml.stream.events.StartElement;

public class Floor{
    public static void main(String[] args) {
        int arr[]={2,3,4,9,14,16};
System.out.println(Binary(arr, 15));
    }

    // Return the index greatest number less than or equal to target
static int Binary(int arr[],int target){

    //But what if the tarhet is greater than greatest number
    if(target>arr[arr.length-1]){
        return-1;
    }
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
            return end;
}
}
