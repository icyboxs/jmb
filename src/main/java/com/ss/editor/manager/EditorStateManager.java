package com.ss.editor.manager;

/**
 * Defines a current editor state.
 *
 * @author pavl_g.
 */
public final class EditorStateManager {
    public enum State {
        INITIALIZING("Initializing"), LOADING("Loading"),
        SAVING("Saving"), UPDATING("Updating"),
        EXITING("Exiting"), OPENING_FILE("Opening File");

        private final String state;

        State(final String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
    private static State currentState = State.UPDATING;

    private static void setCurrentState(final EditorStateManager.State currentState) {
        EditorStateManager.currentState = currentState;
    }

    public synchronized static State getCurrentState() {
        return currentState;
    }

    public static void setLoading() {
        setCurrentState(State.LOADING);
    }

    public static boolean isLoading() {
        return getCurrentState().state.equals(State.LOADING.getState());
    }

    public static void setInitializing() {
        setCurrentState(State.INITIALIZING);
    }

    public static boolean isInitializing() {
        return getCurrentState().state.equals(State.INITIALIZING.getState());
    }

    public static void setSaving() {
        setCurrentState(State.SAVING);
    }

    public static boolean isSaving() {
        return getCurrentState().getState().equals(State.SAVING.getState());
    }

    public static void setUpdating() {
        setCurrentState(State.UPDATING);
    }

    public static boolean isUpdating() {
        return getCurrentState().getState().equals(State.UPDATING.getState());
    }

    public static void setOpeningFile() {
        setCurrentState(State.OPENING_FILE);
    }

    public static boolean isOpeningFile() {
        return getCurrentState().getState().equals(State.OPENING_FILE.getState());
    }

    public static void setExiting() {
        setCurrentState(State.EXITING);
    }

    public static boolean isExiting() {
        return getCurrentState().getState().equals(State.EXITING.getState());
    }
}
