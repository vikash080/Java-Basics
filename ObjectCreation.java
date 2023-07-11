public class ObjectCreation 

{
    public static void main(String[] args) {
        Student s1 = new Student();
        

        s1.Name = "Vikash";
        s1.Age=20;
        s1.Rollno=56789;
        s1.intro();
        s1.study();
    }
}

class Student 
{
    
    String Name;
    int Age;
    int Rollno;

    void intro()
    {
    System.out.println(Name+" is "+Age+" years old .");
    }
    void study()
    {
        System.out.println(Name+" is Studying and having roll no as "+Rollno);
    }

}