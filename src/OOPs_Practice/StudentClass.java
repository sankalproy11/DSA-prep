package OOPs_Practice;
class Students{
    String name;
    int rno;
    double percentage;

    // Constructor is a function which runs when we create an object, and it allocates some variables.

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }
    Students(){
        this.name = "Sankalp";
        this.rno = 12;
        this.percentage = 87.54;
    }
}
public class StudentClass {

    public static void main(String[] args) {
        Students student1 = new Students();
//        student1.name = "Sankalp";
//        student1.rno = 11;
//        student1.percentage = 95.89;

        System.out.println(student1);
        //OOPs_Practice.Students@30f39991
        System.out.println(student1.rno);

        student1.greeting();
    }

}
