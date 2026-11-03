package ma.emsi.ramziahmedrayane.tp1_ramziahmedrayane_19.llm;

public class RequeteException extends Exception {
    private final String requeteJson;
    public RequeteException(String message, String requeteJson) {
        super(message);
        this.requeteJson = requeteJson;
    }
    public String getRequeteJson() {
        return requeteJson;
    }
}