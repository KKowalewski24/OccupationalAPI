package pl.kkowalewski.occupationalapi.exception.service;

public class ClientNotFoundException extends RepositoryItemNotFoundException {

    /*------------------------ FIELDS REGION ------------------------*/

    /*------------------------ METHODS REGION ------------------------*/
    public ClientNotFoundException() {
    }

    public ClientNotFoundException(String message) {
        super(message);
    }

    public ClientNotFoundException(Throwable cause) {
        super(cause);
    }
}
    