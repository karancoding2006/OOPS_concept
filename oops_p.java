package DSA.OOPS;

public class oops_p {
    public static void main (String args[]){
        fish shark = new fish();
        shark.eat();
        shark.breath();
        // Student s1 = new Student("Karan",149);
        // System.out.println(s1.name);
        // System.out.println(s1.rollno);
    
    }
}

// class Student{
//     String name;
//     int rollno;

//     Student(String name , int rollno){
//         this.name = name;
//         this.rollno = rollno;
        
//         //System.out.println();
//     }

// }

//Inheritane
//gparents class ->parent class -> child class

class animal{//parent class
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breath(){
        System.out.println("breathing");
    }
}

//child class
class fish extends animal{
    int fins;

    void swims(){
        System.out.println("swimming under the water!");
    
    }

}