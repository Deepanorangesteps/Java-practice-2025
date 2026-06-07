package functions;
// 17-12-2025
public class VarArgs {
    // VARIABLE LENGTH ARGUMENTS when we do not know how many inputs we are giving
    public static void main(String[] args) {
fun();// this would call more than one or zero arguments
        multiple(5,6,"Hii","Hello");
        /* static void multiple(int a,int ...c,int b){
        variable length arguments does not allowed in center becuase how would be know
        where is the b is
         */
        // VARIABLE LENGTH Arguments should be declared only in last
        //NOTE in method overloading consider we have two function with different parameter one is
        // varargs int and another one is varargs string in varargs we do not pass value but in overloading varargs want to pass
        // because how this know which varargs function want to call int or string so error
    }
    static void multiple(int a,int b,String ...v){

    }
    static  void fun(int ...a){// here just taking internally array of integers or String

    }
}
