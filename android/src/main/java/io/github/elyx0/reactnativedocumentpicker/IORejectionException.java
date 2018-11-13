package io.github.elyx0.reactnativedocumentpicker;

class IORejectionException extends Exception {
    private String code;

    public IORejectionException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
