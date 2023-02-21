package ClassDays.Day42;

public class GenericHeapClient {
    public static void main(String[] args) {
        GenericHeap<Cars> gp = new GenericHeap<>();
        gp.add(new Cars(200, 10, "White"));
        gp.add(new Cars(1000, 20, "Black"));
        gp.add(new Cars(345, 3, "Yellow"));
        gp.add(new Cars(34, 89, "Grey"));
        gp.add(new Cars(8907, 6, "Red"));
        gp.display();
        System.out.println(gp.remove());
        gp.display();
    }
}
