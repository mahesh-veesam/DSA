public class BinaryTree{

    private Treenode root;

    private class Treenode {
        private int data;
        private Treenode left;
        private Treenode right;

        public Treenode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        Treenode first = new Treenode(1);
        Treenode second = new Treenode(2);
        Treenode third = new Treenode(3);
        Treenode fourth = new Treenode(4);
        Treenode fifth = new Treenode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

    }

    public void preOrder(Treenode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Treenode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void postOrder(Treenode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Treenode root){
        System.out.println(root.data);

    }

    public static void main(String[] args) {    
        BinaryTree bt = new BinaryTree();

        bt.createBinaryTree();
         
        System.out.print("Pre Order  : ");
        bt.preOrder(bt.root);
               System.out.println(" ");

        System.out.print("In Order   : ");
        bt.inOrder(bt.root);
               System.out.println(" ");

        System.out.print("post Order : ");
        bt.postOrder(bt.root);
    }
}