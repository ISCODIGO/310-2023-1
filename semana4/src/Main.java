import com.allendowney.thinkdast.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList();
        mll.add(10);
        System.out.println(mll);
        mll.add(2, 20);
        System.out.println(mll.size());
    }
}