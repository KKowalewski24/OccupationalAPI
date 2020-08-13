package pl.kkowalewski.occupationalapi.constant;

public class Constants {

    /*------------------------ FIELDS REGION ------------------------*/
    private static final String CLIENTS = "clients";
    private static final String DEVELOPERS = "developers";
    private static final String TECHNOLOGIES = "technologies";

    public static final String UNDERSCORE_ID = "_id";
    public static final String UNDERSCORE_FK = "_fk";
    public static final String LOWER_CASE_DEVELOPER = "developer";
    public static final String LOWER_CASE_CLIENT = "client";

    public static final String PATH_HOME = "";
    public static final String SLASH = "/";

    public static final String PATH_CLIENTS = SLASH + CLIENTS;
    public static final String PATH_DEVELOPERS = SLASH + DEVELOPERS;
    public static final String PATH_TECHNOLOGIES = SLASH + TECHNOLOGIES;

    /*------------------------ METHODS REGION ------------------------*/
    private Constants() {
    }
}
