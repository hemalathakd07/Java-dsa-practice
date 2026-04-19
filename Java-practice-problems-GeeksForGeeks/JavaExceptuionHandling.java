class Solution {
    public int findMin(int a, int b) {
        int min = Integer.MAX_VALUE;
        
        min = Math.min(min, a + b);
      
        min = Math.min(min, a - b);
        
        min = Math.min(min, a * b);
        
        try {
            int div = a / b;
            min = Math.min(min, div);
        } catch (ArithmeticException e) {
        }
        return min;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int result=solution.findMin(3,2);
        System.out.println(result);
    }
}