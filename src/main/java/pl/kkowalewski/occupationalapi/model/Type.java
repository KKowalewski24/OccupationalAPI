package pl.kkowalewski.occupationalapi.model;

public enum Type {
    FRONT_END("Front-end"),
    BACK_END("Back-end");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
