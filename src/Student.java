public class Student implements PayingStudents {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getGrades(int gradeGiven) {
        System.out.println(name+" got the grade: "+gradeGiven);
    }

    @Override
    public void getLearning(String topic) {
        System.out.println(name+" learned about the topic: "+topic);
    }

    



}
