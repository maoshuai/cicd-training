package guessnumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Answer {
    private List<String> answerDigits;
    public Answer(List<String> answerDigits){
        this.answerDigits = answerDigits;
    }

    public String toPrintFormat(){
        return String.join(" ", answerDigits);
    }


    public String guess(String inputDigits) {

        String[] inputDigitsArr = inputDigits.split(" ");

        Set<String> inputDigitsSet = new HashSet<>(Arrays.asList(inputDigitsArr));
        if (inputDigitsArr.length != inputDigitsSet.size()) {
            return "输⼊不正确，重新输⼊";
        }

        int exactlyRight = 0;
        int onlyDigitRight =0;


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
