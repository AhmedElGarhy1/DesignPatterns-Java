package CommandPattern.Commands;

import CommandPattern.Application;
import CommandPattern.Editor;

public class CutCommand extends Command{
    public CutCommand(Editor editor, Application application) {
        super(editor, application);
    }

    @Override
    public void execute() {
        this.saveBackup();
        application.clipboard = editor.getSelected();
        editor.deleteSelected();
    }
}
