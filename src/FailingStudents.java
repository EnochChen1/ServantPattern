public class FailingStudents implements PayingStudents {
    private String name;
    private int grade;

    public FailingStudents(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getGrades(int gradeGiven) {
        grade = gradeGiven;
        System.out.println(name+" got the grade: "+grade);
    }

    @Override
    public void getLearning(String topic) {
        System.out.println(name+" learned about the topic: "+topic);
    }

    @Override
    public void needHelp() {
        if(grade < 60) {
            System.out.println(name+" needs help.");
        }
        else {
            System.out.println(name+" does not need help.");
        }
    }

    
}
