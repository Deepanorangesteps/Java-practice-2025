package streamsApis;

import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,5,6);
        //list.forEach(n -> System.out.println(n));

//     //   list.stream().filter(n -> n%2 ==0).forEach(System.out::println);
//        list.stream().map(n -> n*n).forEach(System.out::println);
//        System.out.println("List:"+list);
        printEvenNum(List.of(5,4,3,2,6,7,8));
    }

    static void printEvenNum(List<Integer>list){
        list.stream().filter(n -> n>5).forEach(System.out::println);
    }
}
