public class Tree {

    //Class Node to store data and the children nodes
    class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node (int data) {
            this.data = data;
            leftChild = rightChild = null;
        }
    }

    Node root;

    //Tree class constructor
    public Tree () {
        root = null;
    }

    //Accessible insert method to call the recursive one
    public void insert (int data){
        root = insertNode(root, data);
    }

    //Recursive insert method to define the nodes
    public Node insertNode (Node node, int key){
        if (node == null){
            node = new Node(key);
            return node;
        }

        if (key <= node.data){
            node.leftChild = insertNode(node.leftChild, key);
        } else if (key > root.data){
            node.rightChild = insertNode(node.rightChild, key);
        }

        return node;
    }

    //Accessible find method to call the recursive one
    public Node find(int data){
        Node node = findNode(root, data);
        return node;
    }

    //Recursive find method to explore the children nodes
    public Node findNode (Node node, int data){
        if (data == node.data){
            return node;
        }

        if (data <= node.data){
            return findNode(node.leftChild, data);
        } else if (data > node.data){
            return findNode(node.rightChild, data);
        }

        return null;
    }

    public static void main (String [] args){
        int [] data = {1,2,3,4,5,6,7,8,9,10};

        Tree binaryTree = new Tree();

        for (int i = 0; i < data.length; i++){
            binaryTree.insert(data[i]);
        }

        Node node = binaryTree.find(9);
        System.out.println(node.data);
    }


}