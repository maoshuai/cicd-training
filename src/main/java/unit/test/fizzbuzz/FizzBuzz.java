package unit.test.fizzbuzz;

public class FizzBuzz {
    public String handleNumber(int i) {
       if(i % 3 == 0){
           return "Fizz";
       }

       return String.valueOf(i);
    }
}
