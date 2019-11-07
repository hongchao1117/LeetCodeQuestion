package Tree.test;

public class Tree {
    private Node root;//树的根结点

    //构造空树
    public Tree() {
    }
    //非空普通树
    public Tree(Node root) {
        this.root = root;
    }

    //创建树
    public Tree CreateTree(){

        Node k = new Node('k',null,null);
        Node f = new Node('f',k,null);
        Node e = new Node('e',null,f);
        Node j = new Node('j',null,null);
        Node l = new Node('l',null,null);
        Node i = new Node('l',l,j);
        Node h = new Node('h',null,i);
        Node d = new Node('d',h,null);
        Node g = new Node('g',null,null);
        Node c = new Node('c',g,d);
        Node b = new Node('b',e,c);
        Node a = new Node('a',b,null);

        return new Tree(a);//创建以a为root的树
    }

    //前序遍历
    public void BeforeReader(Node node){
        if (node != null){
            System.out.print(node.getData());
            BeforeReader(node.getFirstChild());
            BeforeReader(node.getNextSibling());
        }
    }

    //后序遍历
    public void AfterReader(Node node){
        if (node!=null){
          AfterReader(node.getFirstChild());
          System.out.print(node.getData());
          AfterReader(node.getNextSibling());
        }
    }


    public static void main(String[] args) {
        Tree debug=new Tree();//创建树对象
        Tree cs=debug.CreateTree();//创建树
        Node root=cs.root;  //取得树的根节点
        System.out.println("树的先根遍历");
        cs.BeforeReader(root);
        System.out.println();
        System.out.println("树的后根遍历");
        cs.AfterReader(root);

    }
}
