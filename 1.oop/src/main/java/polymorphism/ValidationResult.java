package polymorphism;

public class ValidationResult {

    private String AccountName;

    private int Result;

    public String getMessage() {
        return Message;
    }

    private String Message;


    public ValidationResult(String accountName, int result, String message) {
        AccountName = accountName;
        Result = result;
        Message = message;
    }


}
