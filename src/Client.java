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

        professor.setTopic("Servant Design Pattern");
        professor.takeAttendance(student1);
        professor.takeAttendance(student2);
        professor.takeAttendance(student3);
        professor.takeAttendance(student4);
        professor.takeAttendance(student5);
        professor.takeAttendance(student6);

        professor.teach(student1);
        professor.teach(student2);

        professor.grade(student6, 100);

        professor.attendanceList();



    }
}
