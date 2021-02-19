package hashtab;

public class HashtabDemo {
    public static void main(String[] args) {
        Hashtab hashtab=new Hashtab(10);
        hashtab.add(1, "张三");
        hashtab.add(5, "电七");
        hashtab.add(2, "李四");
        hashtab.add(6, "钱八");
        hashtab.add(9, "孙十");
        hashtab.add(3, "王五");
        hashtab.add(4, "赵六");
        hashtab.show();
        hashtab.find(6);
        hashtab.delete(3);
        hashtab.delete(6);
        hashtab.delete(9);
        System.out.println("删除后：");
        hashtab.show();
    }
}
