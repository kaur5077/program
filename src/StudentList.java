
import studentlist.Student;


public class StudentList {
    public static void main(String[] args){
            Student  s1 = new Student();
            s1.setName("Shaimaa");
            s1.setID(1234);
            
            Student s2 = new Student("John", 4321);
   
            Student[] studentList = new Student[5];
            studentList[0] = s1;
            studentList[1] = s2;
            studentList[2] = new Student("ABC", 4444);
            studentList[3] = new Student("XYZ", 555);
            studentList[4] = new Student("LMN", 9999);
            
            for(int i=0; i< studentList.length;i++)
                System.out.println("i = "+ i + "==> Name: " + studentList[i].getName() + " ID: " + studentList[i].getID());
     
            s1 = new Student("Smith",789);
   
            System.out.println("s1 == > Name: " + s1.getName() + " ID: " + s1.getID());
            System.out.println("s2 == > Name: " + s2.getName() + " ID: " + s2.getID());
    
   
            
    }
    
}
