import java.util.Arrays;
class Solution {
    public static String TieBreak(String arr[]) {
        Arrays.sort(arr);
        int count=1;
        int maxCount=1;
        String result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].equals(arr[i-1])){
                count++;
            }else{
                count=1;
            }
            if(count>maxCount){
                maxCount=count;
                result=arr[i];
            }
            
        }
            return result;
        }
        
        
    
    public static void main(String[] args){
        String[] str={"Turin","Nick","Turin","Nick"};
        String result=TieBreak(str);
        System.out.println(result);
    }
}