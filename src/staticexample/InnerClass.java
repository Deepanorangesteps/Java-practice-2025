package staticexample;
// 22-01-2026 so here we have static key word and inner class
public class InnerClass {// main class not to be static
   static class Test{ // we set inner class as a static so it does not object dependent
        String name;
        public Test(String name) {
            this.name = name;
        }
    }
    static class Test2{
      static String name;

        public Test2(String name) {
            Test2.name= name;
        }
    }
    public static void main(String[] args) {
      Test t = new Test("Alex");
      Test t2 = new Test("Micheal");
        System.out.println(t.name+" "+t2.name); // this is object dependt so print different values

        Test2 a = new Test2("ALex");
        Test2 b = new Test2("Andrew");
        System.out.println(Test2.name +" "+Test2.name); // here name is declared as a static so if value is changes
        // and print the latest value

    }
}
