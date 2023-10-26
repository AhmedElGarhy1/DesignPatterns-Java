package SingeltonPattern;

public class Database {
    static private Database instance;
    private int instancesNumber = 0;

    private Database(){
        this.instancesNumber++;
    }

    static public Database getInstance(){
        if(instance == null)
            instance = new Database();

        return instance;
    }

    public String query(String sql){
        return "Query: " + sql;
    }

    public int howManyInstance(){
        return instancesNumber;
    }
}
