package Homework.School;

public class Student {
    private String name;
    private int ID;
    private static int nextID = 2538;
    public Student(String studentname, int studentID) {
        name = studentname;
        ID = studentID;
    }
    public void changeName(String newName) {
        name = newName;
    }
    public Student(String studentname) {
        name = studentname;
        ID = nextID ++;
    }

    public static Boolean comparison(Student student1, Student student2) {
        if (student1.ID < student2.ID){
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        return " ";
    }


    public static void main(String[] args) {
        Student bob1 = new Student("Bob Smith", 971);
        Student bob2 = new Student("Bob Jones", 4321);
        System.out.println(comparison(bob1, bob2));
        System.out.println(comparison(bob2, bob1));
        System.out.println(comparison(bob2, bob2));
    }
    }
