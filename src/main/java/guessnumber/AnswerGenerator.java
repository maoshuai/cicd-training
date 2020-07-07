package guessnumber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AnswerGenerator {
    public static final int DEISTS = 4;

    public Answer generate(){
        List<String> answerDegits = new ArrayList<>();
        for (int i = 0; i < DEISTS; i++) {
            while(true){
                String randomValue = String.valueOf(ThreadLocalRandom.current().nextInt(10));
                if(!answerDegits.contains(randomValue)){
                    answerDegits.add(randomValue);
                    break;
                }
            }

        }
        return new Answer(answerDegits);
    }
}
