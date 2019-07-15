import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        List<Integer>numList = new ArrayList<>();
        numList.add(3);
        numList.add(5);

        System.out.print(numList.get(0));

        List<Student> stuList = new ArrayList<>();
        stuList.add (new Student("Sam", 4.0));
    }
}
