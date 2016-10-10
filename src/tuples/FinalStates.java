package tuples;

import java.util.ArrayList;
import java.util.HashSet;

public class FinalStates {
    private HashSet<State> finalStates;

    public FinalStates(ArrayList<State> states) {
        this.finalStates = new HashSet<State>(states);
    }

    public HashSet<State> getFinalStates() {
        return finalStates;
    }
}
