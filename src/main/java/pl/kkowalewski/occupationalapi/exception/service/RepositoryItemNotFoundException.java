package pl.kkowalewski.occupationalapi.exception.service;

public abstract class RepositoryItemNotFoundException extends RuntimeException {

    /*------------------------ FIELDS REGION ------------------------*/

    /*------------------------ METHODS REGION ------------------------*/
    public RepositoryItemNotFoundException() {
    }

    public RepositoryItemNotFoundException(String message) {
        super(message);
    }

    public RepositoryItemNotFoundException(Throwable cause) {
        super(cause);
    }
}
    