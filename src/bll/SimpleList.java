package bll;

public class SimpleList {

    private Node head;

    public void append(int value) {

        Node currentNode = null;

        if (this.head == null) {
            this.head = new Node(value);
        } else {
            currentNode = this.head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(value));
        }

    }

    public void prepend(int element) {
        Node newNode = new Node(element);
        if (this.head != null) {
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            this.head = newNode;
        }
    }

    public int size() {
        Node currentNode = this.head;
        int counter = 0;

        while (currentNode != null) {
            counter++;
            currentNode = currentNode.getNext();
        }
        return counter;
    }

    public boolean update(int position, int value) {
        Node currentNode = this.head;
        int counter = 0;
        boolean worked = false;

        if (position >= 0 && position < size()) {
            while ( counter != position ) {
                counter++;
                currentNode = currentNode.getNext();
            }
            currentNode.setValue(value);
            worked = true;
        }
        return worked;
    }

    public boolean remove(int position){
        Node currentNode = this.head;
        int counter = 0;
        boolean worked = false;

        if(position > 0 && position < size()){
            while(counter != position - 1){
                counter++;
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
            worked = true;
        } else if(position == 0){
            this.head = currentNode.getNext();
            worked = true;
        }
        return worked;
    }

    public boolean insertAt(int position, int value){
        Node currentNode = this.head;
        Node newNode = new Node(value);
        Node helperNode = null;
        int counter = 0;
        boolean worked = false;

        if(position > 0 && position < size()){
            while(counter != position - 1){
                counter ++;
                currentNode = currentNode.getNext();
            }
            helperNode = currentNode.getNext();
            currentNode.setNext(newNode);
            newNode.setNext(helperNode);
            worked = true;
        } else if(position == 0){
            newNode.setNext(this.head);
            this.head = newNode;
            worked = true;
        }
        return worked;
    }

    public boolean removeAt(int value){
        Node currentNode = this.head;
        boolean worked = false;

        while(!worked && currentNode.getNext() != null){
            if(currentNode.getNext().getValue() == value){
                currentNode.setNext(currentNode.getNext().getNext());
                worked = true;
            }
            currentNode = currentNode.getNext();
        }

        if( value == this.head.getValue()){
            this.head = this.head.getNext();
            worked = true;
        }
        return worked;
    }

    @Override
    public String toString() {
        String s = "";
        Node currentNode = this.head;

        while (currentNode != null) {
            s += currentNode.getValue() + " ";
            currentNode = currentNode.getNext();
        }
        return s;
    }
}
