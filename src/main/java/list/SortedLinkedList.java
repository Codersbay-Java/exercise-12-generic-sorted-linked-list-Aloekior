package list;

public class SortedLinkedList<S extends Comparable<S>> implements SortedList<S> {
    private Node<S> head;
    int size = 0;

    @Override
    public void insert(S element) {
        if (size == 0) {
            head = new Node<S>(element);
        } else {
            Node<S> newNode = new Node<S>(element);
            if (newNode.getValue().compareTo(head.getValue()) < 0) { // if added is before first
                newNode.next = head;
                head = newNode;
            } else {
                Node<S> current = head;
                Node<S> prev = head;

                while (current != null && newNode.getValue().compareTo(prev.getValue()) >= 0) {
                    prev = current;
                    current = current.next;
                }
                prev.setNext(newNode); // loop if first
                newNode.setNext(current);
            }
        }
        size++;
    }

    @Override
    public boolean delete(int index) {
        Node<S> current = head;
        Node<S> prev = head;
        int count = 0;

        if (!isInRange(index)) {
            return false;
        }

        if (index == 0) {
            if (size == 1) {
                head = null;
            } else {
                head = head.next;
            }
        } else {
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            prev.setNext(current.next);
        }
        size--;

        return true;
    }

    private boolean isInRange(int index) {
        if (size == 0 || index < 0 || index > size - 1) {
            return false;
        }
        return true;
    }

    @Override
    public S get(int index) {
        if (isInRange(index)) {
            Node<S> current = head;
            int count = 0;

            while (current.next != null && count < index) {
                current = current.next;
                count++;
            }
            return current.getValue();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<S> current = head;

        while (current != null) {
            sb.append(current.getValue().toString());
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

    private class Node<S> {
        private final S value;
        private Node<S> next;

        public Node(S value) {
            this.value = value;
        }

        public S getValue() {
            return value;
        }

        public void setNext(Node<S> next) {
            this.next = next;
        }
    }
}