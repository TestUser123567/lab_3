public class Subject {
    private String[] nameSubjects = {"Math", "Art", "PT", "History", "Music"};
    private String nameSubject;
    private float mark;
    private boolean passed;

    public Subject(int i){
        this.nameSubject = nameSubjects[i];
    }

    public void setNameSubject(String nameSubject){
        this.nameSubject = nameSubject;
    }
    public void setMark(float mark){
        this.mark = mark;
    }
    public void setPassed(boolean passed){
        this.passed = passed;
    }

    public String getNameSubject(){ return nameSubject; }
    public float getMark(){return mark; }
    public boolean isPassed(){ return passed; }

}
