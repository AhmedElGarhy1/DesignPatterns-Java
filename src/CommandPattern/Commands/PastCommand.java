package CommandPattern.Commands;

import CommandPattern.Application;
import CommandPattern.Editor;

public class PastCommand extends Command{

    public PastCommand(Editor editor, Application application) {
        super(editor, application);
    }

    @Override
    public void execute() {
        this.saveBackup();
        this.editor.setSelected(application.clipboard);
    }
}
