package ClassDays.Day30;
/*
 */
public class CycleClient {
    public static void main(String[] args) throws Exception {
        CycleCreate cc=new CycleCreate();
        cc.addLast(1);
        cc.addLast(2);
        cc.addLast(3);
        cc.addLast(4);
        cc.addLast(5);
        cc.addLast(6);
        cc.addLast(7);
        cc.addLast(8);
        cc.display();
        cc.createCycle();
        cc.CycleRemoval();
        cc.createCycle();
        cc.FloydCycleRemoval();
        cc.display();
    }
}