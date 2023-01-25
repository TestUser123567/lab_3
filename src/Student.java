public class Student {
    int id;
    static int nextId = 1;
    String name;
    String surname;
    String group;
    Subject [] subject; //5

    Student(){
        this.id = nextId++;
    }

    Student(String name, String surname, String group){
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.subject = new Subject[5];
    }

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setSurname(String surname){
        this.surname = surname;
    }
    void setGroup(String group){
        this.group = group;
    }
    void setSubject(Subject[] subject){
        this.subject = subject;
    }

    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    String getSurname(){
        return this.surname;
    }
    String getGroup(){
        return this.group;
    }
    Subject[] getSubject() {
        return subject;
    }
}
