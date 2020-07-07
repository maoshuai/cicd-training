package guessnumber;

import java.util.List;

public class Answer {
    private List<String> answerDigits;
    public Answer(List<String> answerDigits){
        this.answerDigits = answerDigits;
    }

    public String toPrintFormat(){
        return String.join(" ", answerDigits);
    }


    public String guess(String inputDigits) {
        int exactlyRight = 0;
        int onlyDigitRight =0;

        String[] inputDigitsArr = inputDigits.split(" ");

        for (int i=0;i<4;i++){
            if(inputDigitsArr[i].equals(answerDigits.get(i))){
                exactlyRight ++;
            }else if (answerDigits.contains(inputDigitsArr[i])){
                onlyDigitRight++;
            }
        }
        return exactlyRight + "A" + onlyDigitRight + "B";
    }
}
