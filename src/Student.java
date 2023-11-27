public class Student implements PayingStudents {
    private String name;
    private int grade;

    public Student(String name) {
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

    



}
