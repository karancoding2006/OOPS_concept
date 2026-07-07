package DSA.OOPS;

public class oops_p {
    public static void main (String args[]){

        fish shark = new fish();

        shark.swim();
        shark.eat(); //callinng via fish class derived from animal class
        shark.breath();

        bird kokoo = new bird();
        kokoo.fly();
        kokoo.eat(); //callinng via bird class derived from animal class
        kokoo.breath();
        kokoo.breath();

    //     dog luci = new dog();
    //    // luci.eat();
    //     luci.breed = "German Shephard";
    //     luci.legs = 4;
    //     System.out.println("luci is of " + luci.breed + " breed");
    //     System.out.println("luci have " + luci.legs + " legs");


        // fish shark = new fish();
        // shark.eat();
        // shark.breath(); //callinng via fish class derived from animal class
        // shark.swims();

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

//======Inheritance in JAVA =========

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
// class fish extends animal{
//     int fins;

//     void swims(){
//         System.out.println("swimming under the water!");
    
//     }

// }


//muli-level inheritance
class mammals extends animal{
    void walk(){

        System.out.println("walking on land");
    }
}

class fish extends animal{
    void swim(){

        System.out.println();
        System.out.println("The fish is shark");
        System.out.println("swimming in water");
    }
}

class bird extends animal{
    void fly(){
        System.out.println();
        System.out.println("The bird is kukoo");
        System.out.println("flying in the sky");
    }
}


// class dog extends mammals{
//     String breed;

// }


//Hierarchial inheritance
