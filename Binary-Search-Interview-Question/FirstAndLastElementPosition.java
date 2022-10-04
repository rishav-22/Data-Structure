import java.sql.PseudoColumnUsage;

import javax.lang.model.util.ElementScanner6;

public class FirstAndLastElementPosition {
    public static void main(String[] args) {
        
    }
static   int[] searchRange(int[] nums, int target) {
 
    int ans []={-1,-1};

    //Check for first Occurance iif target firsts
int start=search(nums, target, true);
int end=search(nums, target, false);

ans[0]=start; 
;ans[1]=end;
      return ans;  
}

//This funnction will return the index value of target

 static int search(int [] nums,int target,boolean findStartIndex){
 int ans=-1;
int start=0; int end=nums.length-1;
 while(start<=end){
    int mid= start+(end-start)/2;
    if(target<nums[mid]){
        end=mid-1;
    }else if(target>nums[mid]){
        start=mid+1;
    }
    else{
        //Potential answew found
        ans=mid;
        if(findStartIndex){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
  
}
return ans;
}

}
 