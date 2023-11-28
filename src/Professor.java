import java.util.ArrayList;
import java.util.List;

public class Professor {
    private static Professor INSTANCE;
    private final List<PayingStudents> studentList;
    private String name;
    private String topic;

    public static Professor getInstance(String name) {
        if(INSTANCE == null) {
            INSTANCE = new Professor(name);
        }
        return INSTANCE;
    }

    private Professor(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void grade(PayingStudents payingStudents, int gradeGiven) {
        payingStudents.getGrades(gradeGiven);
    }

    public void teach(PayingStudents payingStudents) {
        payingStudents.getLearning(topic);
    }

    public void takeAttendance(PayingStudents payingStudents) {
        studentList.add(payingStudents);
    }

    public void attendanceList() {
        for(int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).getName());
            if(i != studentList.size()-1) {
                System.out.print(", ");
            }
        }
        System.out.println(" were present for this lecture.");
    }

    public void studentNeedHelp(PayingStudents payingStudents) {
        payingStudents.needHelp();
    }

}
