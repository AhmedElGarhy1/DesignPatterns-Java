package CommandPattern.Commands;

import CommandPattern.Application;
import CommandPattern.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor, Application application) {
        super(editor, application);
    }

    @Override
    public void execute() {
        saveBackup();
        application.clipboard = editor.getSelected();
    }

}
