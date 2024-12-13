// Definição da exceção personalizada
public class ChefeInvalidoException extends Exception {
    @Override
    public String getMessage() {
        return "Um funcionário não pode ser chefe de si mesmo.";
    }
}
