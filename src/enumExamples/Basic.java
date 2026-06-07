package enumExamples;
// 08-02-2026 enums and use cases
public class Basic {

    // enum explicity EXTEND java.lang.enum class so it alreayd extend that class so it not able to extend other class
    // enum cannot be a super class
    // it will implemets interface but not support abstract methods need a body
    // it should be compared by == operator
    enum  Week   implements  A{
            Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;


        // these are enum constants
        // its default static final
        // since its final you can create a child enums
        // type is week

        Week(){
            System.out.println("Constructor called for this "+this);
        }// this constructor is not public or protecter it is default or private

        @Override
        public void hello() {
            System.out.println("Hello enum ");
        }
        // why we don't want to create a new object
        // bascially it will call all days if we acces any of one
        // internally it looks like public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week);
        for (Week day:Week.values()
             ) {
            System.out.println(day);
        }
        System.out.println(week.ordinal());// print index of the day
        week.hello();
    }
}
