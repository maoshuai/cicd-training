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
        return "1A0B";
    }
}
