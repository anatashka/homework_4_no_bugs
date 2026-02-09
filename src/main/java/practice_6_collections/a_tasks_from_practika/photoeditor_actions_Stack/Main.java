package practice_6_collections.a_tasks_from_practika.photoeditor_actions_Stack;

public class Main {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.addNewAction("edit eyes");
        photoEditor.addNewAction("edit nose");
        photoEditor.addNewAction("edit teeth");
        photoEditor.addNewAction("edit body");
        photoEditor.addNewAction("edit hair");
        photoEditor.printActions();

        photoEditor.undoLastAction();
        photoEditor.printActions();

        photoEditor.undoLastAction();
        photoEditor.printActions();

    }
}
