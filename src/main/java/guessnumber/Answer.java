package guessnumber;

import java.util.List;

public class Answer {
    private List<String> answerDigits;
    public Answer(List<String> answerDigts){
        this.answerDigits = answerDigts;
    }

    public String toPrintFormat(){
        return String.join(" ", answerDigits);
    }
}
