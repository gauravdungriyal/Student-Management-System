import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void updateStudent(Student std){
        boolean notFullyUpdated=true;
        while(notFullyUpdated){
            System.out.println("What you want to Update");
            System.out.println("1. Update Name");
            System.out.println("2. Update Roll no.");
            System.out.println("3. Update Age");
            System.out.println("4. Update Course");
            System.out.println("5. Exit");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter new Name");
                    String name=sc.next();
                    std.setName(name);
                    break;
                case 2:
                    System.out.println("Enter new Roll no.");
                    int rollNo=sc.nextInt();
                    std.setRollNo(rollNo);
                    break;
                case 3:
                    System.out.println("Enter new Age");
                    int age=sc.nextInt();
                    std.setAge(age);
                    break;
                case 4:
                    System.out.println("Enter new Course");
                    String course=sc.next();
                    std.setCourse(course);
                    break;
                case 5:
                    notFullyUpdated=false;
                    break;
            }
        }

    }
    public static void main(String[] args) {
        Admin admin=new Admin();
        ArrayList<Student> studentsData=new ArrayList<Student>();
        boolean notTerminate=true;
        while(notTerminate){
            System.out.println("==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            System.out.println("Enter admin name");
            String adminName=sc.next();
            System.out.println("Enter admin password");
            String adminPassword=sc.next();
            if(!Objects.equals(adminName, admin.getUserName()) || !Objects.equals(adminPassword, admin.getPassword())){
                System.out.println("Wrong credentials");
                return;
            }
            switch (choice){
                case 1:
                    System.out.println("Enter name of Student");
                    String name=sc.next();
                    System.out.println("Enter Roll no. of Student");
                    int rollNo=sc.nextInt();
                    System.out.println("Enter Age of Student");
                    int age=sc.nextInt();
                    System.out.println("Enter Course of Student");
                    String course=sc.next();
                    Student std1=new Student(name,rollNo,age,course);
                    studentsData.add(std1);
                    break;
                case 2:
                    int i=1;
                    for (Student studentsDatum : studentsData) {
                        System.out.println("Student No. "+ i);
                        System.out.println("Name= " + studentsDatum.getName());
                        System.out.println("Roll no= "+ studentsDatum.getRollNo());
                        System.out.println("Age= " + studentsDatum.getAge());
                        System.out.println("Course " + studentsDatum.getCourse());
                        i+=1;
                    }
                    break;
                case 3:
                    System.out.println("Enter the Roll No. of Student you want to update");
                    int updateRollNo=sc.nextInt();
                    boolean isChange=false;
                    for (Student studentsDatum : studentsData) {
                        if (studentsDatum.getRollNo() == updateRollNo) {
                            updateStudent(studentsDatum);
                            isChange = true;
                            break;
                        }
                    }
                    if(!isChange) {
                        System.out.println("Entered Roll no. Doesn't Exist in the Database");
                    }
                    break;
                case 4:
                    System.out.println("Enter the Roll No. of Student you want to delete");
                    int deleteRollNo=sc.nextInt();
                    boolean isDeleted=false;
                    for(int x=0;x<studentsData.size();x++){
                        if(studentsData.get(x).getRollNo()==deleteRollNo){
                            studentsData.remove(x);
                            isDeleted=true;
                            break;
                        }
                    }
                    if(!isDeleted) {
                        System.out.println("Entered Roll no. Doesn't Exist in the Database");
                    }
                    break;
                case 5:
                    notTerminate=false;
                    break;
            }
        }


    }
}
