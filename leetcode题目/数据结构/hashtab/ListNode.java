package leetcode题目.数据结构.hashtab;

public class ListNode {
    public Employee head;

    public void add(Employee employee) {
        if (head==null) head=employee;
        else {
            Employee temp=head;
            if (temp.getId()>employee.getId()){
                employee.next=temp;
                head=employee;
            }
            else {
                while (temp.next!=null&&temp.next.getId()<employee.getId()){
                    temp=temp.next;
                }
                if (temp.next==null) temp.next=employee;
                else {
                    employee.next=temp.next;
                    temp.next=employee;
                }
            }
        }
    }
    //遍历员工
    public void show() {
        Employee temp = head;
        if (temp == null) {
            System.out.println("=> 链表为空");
        }
        while (temp != null) {
            System.out.println("=> " + temp.toString());
            temp = temp.next;
        }
    }

    //查找员工
    public Employee findById(int id) {
        Employee temp = head;
        while (temp != null) {
            if (temp.getId() == id) {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
    public int deleteById(int id){
        Employee temp = head;
        if(head.getId()==id){
            head=head.next;
            return 1;
        }else{
            while (temp.next!=null&&temp.next.getId()!=id){
                temp=temp.next;
            }
            if(temp.next==null){
                System.out.println("该结点不存在，无法删除");
                return -1;
            }else{
                temp.next=temp.next.next;
                return 1;
            }
        }
    }
}

