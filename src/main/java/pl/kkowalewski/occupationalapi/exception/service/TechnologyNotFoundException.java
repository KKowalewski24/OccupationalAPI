package pl.kkowalewski.occupationalapi.exception.service;

public class TechnologyNotFoundException extends RepositoryItemNotFoundException {

    /*------------------------ FIELDS REGION ------------------------*/

    /*------------------------ METHODS REGION ------------------------*/
    public TechnologyNotFoundException() {
    }

    public TechnologyNotFoundException(String message) {
        super(message);
    }

    public TechnologyNotFoundException(Throwable cause) {
        super(cause);
    }
}
    