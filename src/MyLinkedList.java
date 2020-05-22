public class MyLinkedList<N> {
    private Node<N> start;
    private Node<N> end;
    private int length;

    public MyLinkedList() {
    }

    public void add(N value) {
        if (firstNode(value)) return;
        length += 1;
        Node<N> old = end;
        end = new Node<N>(value);
        end.prevNode = old;
        old.nextNode = end;
    }

    public void add(N value,int id) {
        if (firstNode(value)) return;
        if(id>=length){
            add(value);
            return;
        }
        length+=1;
        if(id==0){
            start.prevNode=new Node<>(value);
            start.prevNode.nextNode=start;
            start=start.prevNode;
            return;
        }
        Node<N> iter = getNode(id);
        Node<N> newNode=new Node<>(value);
        newNode.nextNode=iter;
        newNode.prevNode=iter.prevNode;
        iter.prevNode=newNode;
        newNode.prevNode.nextNode=newNode;
    }

    private boolean firstNode(N value) {
        if (start == null) {
            length=1;
            start = new Node<N>(value);
            end = start;
            return true;
        }
        return false;
    }

    public int length() {
        return length;
    }

    public void remove(int id) {
        Node<N> iter;
        iter = getNode(id);
        length -= 1;
        iter.nextNode.prevNode = iter.prevNode;
        iter.prevNode.nextNode = iter.nextNode;
        iter = null;
    }

    private Node<N> getNode(int id) {
        Node<N> iter;
        if (id > length / 2) {
            iter = end;
            for (int i = 0; i < length - id-1; i++) {
                iter = iter.prevNode;
            }
        } else {
            iter = start;
            for (int i = 0; i < id; i++) {
                iter = iter.nextNode;
            }
        }
        return iter;
    }

    public N get(int id) {
        if (id > length - 1 || id < 0) throw new ArrayIndexOutOfBoundsException("Array length: " + length);
        return getNode(id).value;
    }

    private static class Node<N> {
        private Node<N> prevNode;
        private Node<N> nextNode;
        private N value;

        public Node(N value) {
            this.value = value;
        }
    }
}

