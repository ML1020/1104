//二分法(多少次可以找到目标数)
public class Demo {
    public static int binarySearch(int[] array, int value){
        int count = 0;
        int begin = 0;
        int end = array.length - 1;
        while (begin <= end){
            count++;
            int mid = begin + ((end + begin) / 2);
            if (array[mid] < value){
                begin = mid + 1;
            }else if (array[mid] > value){
                end = mid - 1;
            }else {
                System.out.println("count = " + count);
                return count;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        binarySearch(array,2);
    }
}
