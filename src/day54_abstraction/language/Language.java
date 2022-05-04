package day54_abstraction.language;

public interface Language {
    String PLANET = "Earth"; //public static final String planet -> Constant variable -> info that is accessed easily and doesn't change

    //abstract methods
    void hi();

    void bye();
}
