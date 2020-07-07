package guessnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameInputService {
    public String readLine(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Failed to read", e);
        }
    }
}
