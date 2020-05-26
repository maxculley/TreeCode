
public class Runner {
    
    public static void main(String[] args) {
        
        Node root = new Node(7);
        
        root.insert(5);
        root.insert(10);
        root.insert(3);
        root.insert(6);
        root.insert(1);
        
        System.out.println(root.contains(5));
        System.out.println(root.contains(8));
        
        root.printInOrder();
        
    }
}
