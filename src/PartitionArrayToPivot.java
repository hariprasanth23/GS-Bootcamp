import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionArrayToPivot {
    public int[] pivotArray(int[] arr, int pivot){
        List<Integer> lessList= new ArrayList<>();
        List<Integer> equalList = new ArrayList<>();
        List<Integer> greaterList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                lessList.add(arr[i]);
            }else if(arr[i]==pivot){
                equalList.add(arr[i]);
            }else if (arr[i]>pivot){
                greaterList.add(arr[i]);
            }

        }
        List<List<Integer>> temp = Arrays.asList(lessList, equalList, greaterList);
        List<Integer> pivotList =temp.stream().flatMap(Collection::stream).collect(Collectors.toList());

        return Arrays.stream(pivotList.stream().flatMapToInt(x-> IntStream.of(x)).toArray()).toArray();




//        return Stream.of(Arrays.stream(arr).filter(e -> e < pivot),
//                        Arrays.stream(arr).filter(e -> e == pivot),
//                        Arrays.stream(arr).filter(e -> e > pivot))
//                .flatMapToInt(x -> x);



    }
    public static void main(String[] args){
        int[] arr ={9,12,5,10,14,3,10};
        Arrays.stream(new PartitionArrayToPivot().pivotArray(arr,10)).forEach(System.out::println);
    }
}
