package practice_6_collections.z_tasks;

import java.util.LinkedList;

public class Task_7 {
    LinkedList<String> symbols = new LinkedList<>();

    // correct sequences: {()}
    // in// correct sequences: {(}
    public boolean checkSequence(String sequence){
        for (int i = 0; i<sequence.length(); i++) {
            char symbol = sequence[i];

            if ((symbol == "(") || (symbol == "{") || (symbol == "[") || (symbol == "<"))
                symbols.add(symbol);
            if ((symbol == ")") & symbols.getLast().equals("(")) symbols.removeLast();
            if ((symbol == "}") & symbols.getLast().equals("{")) symbols.removeLast();
            if ((symbol == ">") & symbols.getLast().equals("<")) symbols.removeLast();
            if ((symbol == "]") & symbols.getLast().equals("[")) symbols.removeLast();
        }
        if (symbols.isEmpty()) return true;
        else
            return false;
    }
}
