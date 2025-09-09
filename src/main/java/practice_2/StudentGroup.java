package practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup (String someName, int someCount){
        this.groupName = someName;
        this.studentCount = someCount;
    }

    String getGroupName(){
        return this.groupName;
    }

    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String someName){
        this.groupName = someName;
    }

    void setStudentCount(int someCount){
        this.studentCount = someCount;
    }

    void printInfo(){
        System.out.println("В группе " + this.groupName + " " +this.studentCount + " человек");
    }
}
