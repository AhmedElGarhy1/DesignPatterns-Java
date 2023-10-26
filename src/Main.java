import SingeltonPattern.Database;

public class Main {
    public static void main(String[] args){
        Database database1 = Database.getInstance();
        System.out.println(database1.howManyInstance());
        System.out.println(database1.query("SELECT * FROM users;"));

        Database database2 = Database.getInstance();
        System.out.println(database2.howManyInstance());
        System.out.println(database2.query("SELECT * FROM students;"));
    }
}