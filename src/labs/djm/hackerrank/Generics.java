package labs.djm.hackerrank;

public class Generics {
    static <T>void printArray(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Integer[] arr ={1,2,3};
        printArray(arr);
        String[] srr ={"Hello","World"};
        printArray(srr);
    }
}
