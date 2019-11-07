package Tree.test;

//创建树的结点
public class Node {
    private Object data;//结点的数据域
    private Node FirstChild,NextSibling;//左孩子，右兄弟

    //空节点
    public Node() {
    }

    //普通结点
    public Node(Object data, Node firstChild, Node nextSibling) {
        this.data = data;
        FirstChild = firstChild;
        NextSibling = nextSibling;
    }

    //只有数据域的结点
    public Node(Object data) {
        this.data = data;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getFirstChild() {
        return FirstChild;
    }

    public void setFirstChild(Node firstChild) {
        FirstChild = firstChild;
    }

    public Node getNextSibling() {
        return NextSibling;
    }

    public void setNextSibling(Node nextSibling) {
        NextSibling = nextSibling;
    }
}
