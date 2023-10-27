package CommandPattern;

public class Main {
    public static void main(String[] args){
        Application app = new Application();
        app.display();

        app.write("Hello1");
        app.cut();
        app.display();

        app.past();
        app.display();


        app.write("Hello2");
        app.copy();
        app.display();

        app.past();
        app.display();

        app.unExecuteCommand();
        app.display();

        app.unExecuteCommand();
        app.unExecuteCommand();
        app.unExecuteCommand();
        app.display();
    }
}