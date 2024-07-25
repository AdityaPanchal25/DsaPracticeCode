package KunalKushvaYT.DSAPracticeCode.src.com.BinarySearchQuestionGFAM;

public class findPositionElementInfiniteArray {
    public static void main(String args[]){
        // this is question for infinite array.which is asked in amazon. inter this is just practice array with fix size
int arr[]={12,13,16,19,23,24,25,56,65,76,74};
    int target=16;
    System.out.println(ans(arr,target));
    //he;;p
    }
    static int ans(int arr[],int target){
    int start=0;
    int end=1  ;
        while(target>arr[end]){
        int temp=end+1;
        end=end+(end-start+1)*2;
        start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int arr[],int target, int start, int end){
        while(start<=end){
        int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
