
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
class BinaryTree {
    public Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int key) {
        root = new Node(key);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
    }
}

