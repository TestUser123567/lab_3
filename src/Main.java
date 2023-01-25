import javax.swing.plaf.synth.SynthRadioButtonUI;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner_main = new Scanner(System.in);
        Student[] students = new Student[2];

        for(int i = 0; i < students.length; i++)
        {
            String name, surname, group;
            System.out.println("Enter name");
            name = scanner_main.nextLine();
            System.out.println("Enter surname");
            surname = scanner_main.nextLine();
            System.out.println("Enter group");
            group = scanner_main.nextLine();

            students[i] = new Student(name, surname, group);

            Subject subjects[] = new Subject[5];
            for(int s = 0; s < subjects.length; s++)
            {
                subjects[s] = new Subject(s);
                subjects[s].setMark((float)(1 + Math.random()*(5-2)));
                subjects[s].setPassed(subjects[s].getMark() >= 2);
            }
            students[i].setSubject(subjects);
        }
        for (Student student:students){
            System.out.println(student.getId() + ": " + student.getName() + ". Scores:");
            for (Subject subject:student.getSubject()){
                System.out.println(subject.getNameSubject() + " - " + subject.getMark() + " - passed: " + subject.isPassed() + ";");
            }
        }
        System.out.println("Best subject - " + Utils.getTheBestSubject(students) + ";");
        Student beststudent = Utils.getTheBestStudent(students);
        System.out.println("Best student - " + beststudent.getName() + ";");
    }
}