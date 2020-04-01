package pl.kkowalewski.occupationalapi.exception.service;

public class DeveloperNotFoundException extends RepositoryItemNotFoundException {

    /*------------------------ FIELDS REGION ------------------------*/

    /*------------------------ METHODS REGION ------------------------*/
    public DeveloperNotFoundException() {
    }

    public DeveloperNotFoundException(String message) {
        super(message);
    }

    public DeveloperNotFoundException(Throwable cause) {
        super(cause);
    }
}
    