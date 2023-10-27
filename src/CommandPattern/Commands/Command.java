package CommandPattern.Commands;

import CommandPattern.Application;
import CommandPattern.Editor;

public abstract class Command {
    protected Editor editor;
    protected Application application;
    protected String backup;

    public Command(Editor editor, Application application){
        this.editor = editor;
        this.application = application;
    }

    public abstract void execute();
    public void unExecute(){
        editor.setSelected(backup);
    }

    protected void saveBackup(){
        this.backup = this.editor.getSelected();
    }
}
