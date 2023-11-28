public class Client {
    public static void main(String[] args) throws Exception {
        Professor professor = Professor.getInstance("Prof");



        // today's students that come to class
        Student student1 = new Student("Jacob Terrey");
        Student student2 = new Student("Justin Ta");
        Student student3 = new Student("Enoch Chen");
        Student student4 = new Student("David Shahi");
        Student student5 = new Student("Gregorius Avip");
        Student student6 = new Student("Megan Joo");
        FailingStudents failingStudent7 = new FailingStudents("Needs Help");

        professor.setTopic("Servant Design Pattern");
        professor.takeAttendance(student1);
        professor.takeAttendance(student2);
        professor.takeAttendance(student3);
        professor.takeAttendance(student4);
        professor.takeAttendance(student5);
        professor.takeAttendance(student6);
        professor.takeAttendance(failingStudent7);

        professor.teach(student1);
        professor.teach(student2);
        professor.teach(student3);
        professor.teach(student4);
        professor.teach(student5);
        professor.teach(student6);
        professor.teach(failingStudent7);

        professor.grade(student1, 95);
        professor.grade(student2, 96);
        professor.grade(student3, 92);
        professor.grade(student4, 94);
        professor.grade(student5, 97);
        professor.grade(student6, 100);
        professor.grade(failingStudent7, 0);

        professor.studentNeedHelp(student1);
        professor.studentNeedHelp(student2);
        professor.studentNeedHelp(failingStudent7);


        professor.attendanceList();



    }
}
