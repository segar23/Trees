class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node (int data) {
        this.data = data;
        leftChild = rightChild = null;
    }
}

class Tree {
    Node root;

    Tree () {
        root = null;
    }

    public void insertNode (int data) {
        root = new Node(data);
    }

    public Node insert (Node node) {
        if (node.data <= root.data) {
            if (leftChild == null)
                leftChild = node;
            else
                leftChild.insert(node);
        }
        else {
            if (rightChild == null)
                rightChild = node;
            else
                rightChild.insert(node);
        }
    }
}


public class Main {
}
