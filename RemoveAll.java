import java.util.LinkedList;
public class RemoveAll{
    public static void main(String[] args)
    {
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        System.out.println("initial linkedlist:"+linkedList);
        linkedList.clear();
        System.out.println("Linkedlist after removing all elements:"+linkedList);
    }
}