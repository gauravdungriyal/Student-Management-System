public class Student {
    private String name;
    private int rollNo;
    private int age;
    private String course;
    public Student(String name,int rollNo,int age,String course){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.course=course;
    }
    void setCourse(String course){
        this.course=course;
    }
    void setAge(int age){
        this.age=age;
    }
    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    int getRollNo(){
        return this.rollNo;
    }
    String getCourse(){
        return this.course;
    }
}
