package lv.dita;

public class CalculationResult {

    public CalculationResult (float result, boolean isSuccessful, String errorMessage){
        this.result = result;
        this.isSuccessful = isSuccessful;
        this.errorMessage = errorMessage;
    }

    public float getResult() {
        return result;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    private float result;
    private boolean isSuccessful;
    private String errorMessage;

}
