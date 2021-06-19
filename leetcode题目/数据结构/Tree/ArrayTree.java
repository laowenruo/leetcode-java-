package leetcode题目.数据结构.Tree;

public class ArrayTree {
    private Object[] data;
    private final int DEFAULT_DEEP = 8;
    private int deep;
    private int size;

    public ArrayTree() {   //默认参数
        this.deep = DEFAULT_DEEP;
        this.size = (int) Math.pow(2, deep);
        data = new Object[size];
    }

    public ArrayTree(int deep) {   //手动输入深度
        this.deep = deep;
        this.size = (int) Math.pow(2, deep);
        data = new Object[size];
    }

    public ArrayTree(int deep, Object data) {  //指定深度和头节点
        this.deep = deep;
        this.size = (int) Math.pow(2, deep);
        this.data = new Object[size];
        this.data[0] = data;
    }

    public void add(int index, Object object, boolean left) {        //是否为左节点
       if (data[index]==null) throw new RuntimeException(index + "处节点为空，无法添加子节点！");
       if (2*index+1>size||2*index+2>size) throw new RuntimeException("树已满");
       if (left){
           if (data[2*index+1]==null) data[2*index+1]=object;
           else throw new RuntimeException("该节点已存在！");
       }
       else {
           if (data[2*index+2]==null) data[2*index+2]=object;
           else throw new RuntimeException("该节点已存在！");
       }
    }
    public boolean isEmpty(){
        return data[0]==null;
    }
    public Object getRoot(){
        return data[0];
    }
    public void preOrder(int i){
        if (data[i]==null) return;
        System.out.println(data[i]);
        if (2*i+1<size) preOrder(2*i+1);
        if (2*i+2<size) preOrder(2*i+2);
        return;
    }
}
