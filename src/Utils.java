public class Utils {
    public static String getTheBestSubject(Student[] students){
        float maxscore = 0;
        String subname = "";
        float temp[] = new float[5];

        for (Student student:students){
            Subject[] subjects = student.getSubject();
            for(int i = 0; i < subjects.length; i++){
                temp[i] += (subjects[i].getMark()/students.length);
                if(maxscore < temp[i]){ maxscore = temp[i]; subname = subjects[i].getNameSubject();}
            }
        }

        return subname;
    }

    public static Student getTheBestStudent(Student[] students){
        float middleMarks[] = new float[2];
        float maxscoreMark = 0;
        Student beststudent = new Student();

        for (Student student:students){
            Subject[] subjects = student.getSubject();
            for (int i = 0; i < students.length; i++){
                middleMarks[i] += (subjects[i].getMark()/subjects.length);
                if(maxscoreMark < middleMarks[i]){ maxscoreMark = middleMarks[i]; beststudent = student; }
            }
        }

        return beststudent;
    }

}
