package database;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
