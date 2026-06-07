package inheritance.polymorphism;

public class Shapes {
    // this is late binding becuase it will decide during the run time only which method want to call
    void area(){
        System.out.println("I am in shapes");
    }
    static void greeting(){
        System.out.println("I am from shapes");
    }
// ----------------------------------------------------
    /*we can't over ride the final method this final should resolved in the compile time */
    // java compiler can copy the byte code directly with the compile code of calling method hence elimination
    // the overhead associated with the which one is actually resolve
// hence this is Early binding because it resolved earlier compile time
//    final void area(){
//        System.out.println("I am in shapes");
//    }

    // some final key word notes
    // if we declare the class as a final it will restrict the inheritance and implicity all mehtod goes final
}
