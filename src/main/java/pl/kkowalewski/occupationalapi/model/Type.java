package pl.kkowalewski.occupationalapi.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Type {

    /*------------------------ FIELDS REGION ------------------------*/
    FRONT_END("Front-end"),
    BACK_END("Back-end");

    private final String name;

    /*------------------------ METHODS REGION ------------------------*/
    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Type fromString(final String text) {
        return Arrays.asList(Type.values())
                .stream()
                .filter((it) -> it.getName().equals(text))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public static List<String> getNamesList() {
        return Arrays.asList(Type.values())
                .stream()
                .map((it) -> it.getName())
                .collect(Collectors.toList());
    }
}
