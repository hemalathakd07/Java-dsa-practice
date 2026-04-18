class FizzBuzz{
    public static void fizzBuzz(int number) {
        // code here.
        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }
        else if(number%3==0){
            System.out.println("Fizz");
        }
        else if(number%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
    }
        public static void main(String[] args){
            int number=12;
            fizzBuzz(number);
        }
    
}