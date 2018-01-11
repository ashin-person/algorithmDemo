package ljx.ashin.search;

/**
 * 二分查找法
 * Created by Ashin Liang on 2018/1/11.
 */
public class BinarySearch {
    /**
     * 二分法查找数组arrays中val的位置
     * @param val 需要查找的值
     * @param arrays 数组(已经排序好的)
     * @return
     */
    public int binarySearchVal(int val,int[] arrays,int fromIndex,int topIndex){
        int index = -1;
        int len = arrays.length;//长度
       /* int fromIndex = 0;//起始位置
        int topIndex = len-1;//结束位置*/
        int middleIndex = (fromIndex+topIndex)/2;
        if (arrays[middleIndex]==val){
            System.out.println("找到对应的值，index为:"+middleIndex);
            index = middleIndex;
        }else if (arrays[middleIndex]>val){
            topIndex = middleIndex;
            return binarySearchVal(val,arrays,fromIndex,topIndex);
        }else {
            fromIndex = middleIndex;
            return binarySearchVal(val,arrays,fromIndex,topIndex);
        }
        return index;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arrays = {2,5,7,11,45,67,76};
        System.out.println(search.binarySearchVal(11,arrays,0,arrays.length-1));
    }
}
