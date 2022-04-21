package Lisp;

public class LispChecker {
    static final char OPEN = '(';
    static final char CLOSED = ')';
    public static int findAllChars(String input,char toFind) {
        int found = 0;
        for(char c: input.toCharArray()) {
            if(c == toFind)
                found++;
        }
        return found;
    }

    static boolean validate(String input) {
        if(input == null || input.isEmpty()) {
            return true;
        }
        int numOpen = 0;
        for(char c: input.toCharArray()) {
            if(c == OPEN)
                numOpen++;
            if(c == CLOSED)
                numOpen--;
            if(numOpen < 0)
                return false;
        }
        return numOpen == 0 ? true : false;
    }

}
