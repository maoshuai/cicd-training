package unit.test.fizzbuzz;

public class FizzBuzz {
    private FizzBuzzPrintService printService;
    public FizzBuzz(FizzBuzzPrintService printService){
        this.printService = printService;
    }
    public String handleNumber(int i) {
       if(i % 15 == 0){
           return "FizzBuzz";
       }
       if(i % 3 == 0){
           return "Fizz";
       }
       if(i % 5 == 0){
           return "Buzz";
       }
       return String.valueOf(i);
    }

    public void printAnswer(){
        for(int i=1;i<=100;i++){
            printService.print(handleNumber(i));
        }
    }
}
