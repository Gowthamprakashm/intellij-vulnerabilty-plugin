import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class HelloWorldAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        System.out.println("Hello World Printed");
        Messages.showMessageDialog(project, "Hello World!", "Hello", Messages.getInformationIcon());
    }
}