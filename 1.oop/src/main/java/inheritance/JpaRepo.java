package inheritance;

public class JpaRepo<T> {
    private final Class<T> type;


    JpaRepo(Class<T> type) {
        this.type = type;
    }

    public String findAll() {
        return "SELECT * from " + this.type.getName();
    }

}
