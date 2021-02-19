package hashtab;

import java.util.List;
//没有去实现对象比较，如果需要的话仅需在add的时候遍历判断，先判断hashcode，再判断equals
public class Hashtab {
    public ListNode[] listNodes;
    public int maxsize;

    public int getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
        listNodes=new ListNode[maxsize];
        for (int i=0;i<maxsize;i++){
            listNodes[i]=new ListNode();
        }
    }

    public Hashtab(int maxsize) {
        this.setMaxsize(maxsize);
    }
    public void add(int id,String name){
        Employee employee=new Employee(name,id);
        int hash = hash(id);
        listNodes[hash].add(employee);
    }
    public Employee find(int id){
        int hash = hash(id);
        return listNodes[hash].findById(id);
    }
    public int delete(int id){
        int hash = hash(id);
        return listNodes[hash].deleteById(id);
    }
    //遍历
    public void show() {
        for (int i = 0; i < getMaxsize(); i++) {
            System.out.println("第" + (i + 1) + "条链表：");
            listNodes[i].show();
        }
    }
    public int hash(int id){
        int i=id%2;
        return i;
    }
}
