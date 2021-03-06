package tuples;

import java.util.HashMap;

public class NfaTransitions {

    private final HashMap<State, NfaTransition> transitions;

    public NfaTransitions() {
        transitions = new HashMap<>();
    }

    public void put(State state, NfaTransition nfaTransition) {
        transitions.put(state, nfaTransition);
    }

    public States get(State state, Alphabet alphabet) {
        NfaTransition transition = transitions.get(state);
        return transition == null ? null : transition.get(alphabet);
    }
}
