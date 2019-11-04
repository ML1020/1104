//冒泡排序法
public class Demo1 {
    public static void bubbleSort(int[] array){
        //LinkedList<Integer> list = new LinkedList<>();
        for (int j = 0;j < array.length;j++){
            for (int i = 0;i < array.length-j-1;i++){
                if (array[i] > array[i+1]){
                    int temp;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
       int[] array = new int[]{2,3,6,4,9,1,5,7};
        bubbleSort(array);
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
