class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O primeiro número não pode ser maior que o segundo.");
    }
}