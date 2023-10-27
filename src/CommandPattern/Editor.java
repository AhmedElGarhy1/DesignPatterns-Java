package CommandPattern;

public class Editor {
    private String text;

    public void setSelected(String text){
        this.text = text;
    }

    public String getSelected(){
        return text;
    }

    public void deleteSelected(){
        text = "";
    }
}
