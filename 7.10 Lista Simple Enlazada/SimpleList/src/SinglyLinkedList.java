
public class SinglyLinkedList {
    public Node head;
    public Node runner;
    
    public SinglyLinkedList() {
    	head = null;
    }
    //Los metodos de la SLL van aqui. 
    //Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    /*--------------------------------------*/
    public void remove() {
    	runner = this.head;
    	while(runner.next.next != null) {
    		runner = runner.next;
    	}
    	runner.nextNode(null);
    }
    /*--------------------------------------*/
    public void printValues() {
    	runner = this.head;
    	while(runner != null) {
    		System.out.println(runner.getNode());
    		runner = runner.next;
    	}
    }
    /*--------------------------------------*/
    public Node find(int num) {
    	runner = this.head;
    	while(runner != null) {
    		if(runner.getNode() == num) {
    			return runner;
    		}
    		runner = runner.next;
    	}
    	return null;
    }
    /*--------------------------------------*/
    public void removeAt(int n) {
    	runner = this.head;
    	int i = 0;
    	while(runner.next != null) {
    		i += 1;
    		runner = runner.next;
    	}
    	if(n > i) {
    		System.out.println("Quedan pocos nodos en la lista");
    	}else {
    		runner = this.head;
    		int j = 0;
    		while(j < n-1) {
    			runner = runner.next;
    			j++;
    		}
    		System.out.println("Se eliminó el siguiente valor: ("+runner.next.getNode()+"), ubicado en la posición <"+n+"> de la lista");
    		if(runner.next == null) {
    			runner.nextNode(null);
    		}else {
    			Node skip = runner.next.next;
    			runner.nextNode(skip);
    		}
    	}
    }
    /*--------------------------------------*/
}