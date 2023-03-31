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
            if (items.get(i).length() < 5){
                list.add(items.get(i));
            }
        }
        return list;
    }
}