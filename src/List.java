import java.util.Arrays;

public class List {

    public static void main(String...args){
        MyLinkedList<Integer> list= new MyLinkedList<>();
        int[] arr= InsertMethod.randArray(20,20);
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println("arr: "+ Arrays.toString(arr));
        System.out.println(list.get(19));
        list.add(555);

        list.remove(5);
        list.add(555);
        list.add(555);
        list.add(666,0);
        int[] arr2=new int[list.length()];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=list.get(i);
        }
        System.out.println("arr: "+ Arrays.toString(arr2));

        System.out.println(list.get(21));
    }

}
