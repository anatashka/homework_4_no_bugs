package practice_6_collections.z_tasks;

import java.util.Stack;

public class Task_7 {
    private Stack<Character> symbols = new Stack<>();

    // correct sequences: {()}
    // in// correct sequences: {(}
    public boolean checkSequence(String sequence){
        symbols.clear();
        for (int i = 0; i<sequence.length(); i++) {
            char symbol = sequence.charAt(i);

            if (symbol == '(' || symbol == '{' || symbol == '[' || symbol == '<')
                symbols.push(symbol);
            if ((symbol == ')' || symbol == '}' || symbol == '>' || symbol == ']') & symbols.isEmpty())
                return false;
            if (((symbol == ')') && symbols.getLast().equals('(')) || ((symbol == '}') && symbols.getLast().equals('{')) || ((symbol == '>') && symbols.getLast().equals('<')) || ((symbol == ']') && symbols.getLast().equals('[')))
                symbols.removeLast();
        }
        if (symbols.isEmpty())
            return true;
        else
            return false;
    }
}
