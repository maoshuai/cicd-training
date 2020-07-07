package guessnumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Answer {
    private static final String INCORRECT_INPUT_MSG = "输⼊不正确，重新输⼊";
    public static final int ANSWER_DIGITS_LEN = 4;

    private List<String> answerDigits;
    public Answer(List<String> answerDigits){
        this.answerDigits = answerDigits;
    }

    public String toPrintFormat(){
        return String.join(" ", answerDigits);
    }


    public String guess(String inputDigits) {

        String[] inputDigitsArr = inputDigits.split(" ");

        if (inputDigitsArr.length != ANSWER_DIGITS_LEN) {
            return INCORRECT_INPUT_MSG;
        }

        Set<String> inputDigitsSet = new HashSet<>(Arrays.asList(inputDigitsArr));
        if (inputDigitsArr.length != inputDigitsSet.size()) {
            return INCORRECT_INPUT_MSG;
        }

        int exactlyRight = 0;
        int onlyDigitRight =0;


        for (int i = 0; i< ANSWER_DIGITS_LEN; i++){
            if(inputDigitsArr[i].equals(answerDigits.get(i))){
                exactlyRight ++;
            }else if (answerDigits.contains(inputDigitsArr[i])){
                onlyDigitRight++;
            }
        }
        return exactlyRight + "A" + onlyDigitRight + "B";
    }
}
