public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();        
        sll.printValues();
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.remove();
        sll.add(8);
        sll.add(9);
        sll.remove();
        sll.add(69);
        sll.add(1);
        sll.add(2);
        sll.printValues();
        System.out.println(sll.find(69));
        sll.removeAt(4);
        sll.printValues();
        sll.add(3);
        sll.add(4);
        sll.add(47);
        sll.add(48);
        System.out.println("??????");
        sll.printValues();
        System.out.println("!!!!!!");
        sll.removeAt(22);
        sll.removeAt(9);
        sll.printValues();
    }
}