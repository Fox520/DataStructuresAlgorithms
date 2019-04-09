public class BinarySearchTree {
    private Node root;
    private int size;

    public Node insertRec(int current, Node rootNode) {
        if (rootNode == null) {
            return new Node(current);
        } else if (current > rootNode.getVal()) {
            rootNode.setRight(insertRec(current, rootNode.getRight()));
        } else if (current < rootNode.getVal()) {
            rootNode.setLeft(insertRec(current, rootNode.getLeft()));
        }
        return rootNode;
    }

    public void insert(int val) {
        root = insertRec(val, root);
        size++;
    }

    public boolean treeContains(int val) {
        Node tempNode = root;
        int count = 0;

        while (count < size) {
            try {
                if (val == tempNode.getVal()) {
                    return true;
                }
            } catch (IndexOutOfBoundsException ex) {}

            if (val < tempNode.getVal()) {
                tempNode = tempNode.getLeft();
            } else if (val > tempNode.getVal()) {
                tempNode = tempNode.getRight();
            }
            System.out.println("went through " + count + " times");
            count++;

        }
        // Exhausted all Nodes and no match
        return false;
    }

    /**
     * Go as much as possible to the left till leaf
     * Then display root
     * Do the same with the right
     */
    public void printInOrder(Node root){
        if(root != null){
            printInOrder(root.getLeft());
            System.out.println(root.getVal());
            printInOrder(root.getRight());
        }
    }
    public void printInOrder(){
        printInOrder(root);
    }

    @Override
    public String toString() {
        return "Root: " + root.getVal() + "\n" +
                "Left: " + root.getLeft() + "\n" +
                "Right: " + root.getRight();
    }
}
