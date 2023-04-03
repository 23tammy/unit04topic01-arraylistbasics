import java.util.ArrayList;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int max = 0;
        for (int i = 0; i < items.size(); i++){
            if (items.get(i) > max){
                max = items.get(i);
            }
        }
        return max;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> items){
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).length() <= 5){
                list.add(items.get(i));
            }
        }
        return list;
    }

    public static void removeLongWords(ArrayList<String> items){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).length() > 5){
                items.remove(items.get(i));
                i--;
            } 
        }
    }

    public static ArrayList<Double> reversed(ArrayList<Double> nums){
        ArrayList<Double> list = new ArrayList<>();
        for (int i = nums.size()-1; i >= 0 ; i--){
            list.add(nums.get(i));
        }
        return list;
    }

    public static void reverseInPlace(ArrayList<Double> nums) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = nums.size()-1; i >= 0 ; i--){
            list.add(nums.get(i));
        }
        for (int i = 0; i < list.size(); i++){
            nums.set(i, list.get(i));
        }
    }
}