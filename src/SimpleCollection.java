import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SimpleCollection {
    String[] array = new String[]
            {"cat", "dog", "ball", "wall", "cat", "phone", "ball", "book", "mouse", "ball"};

    HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

    public void getUniqueWords() {
        System.out.println("List of unique words: " + hashSet);
    }

    public void getRepeatedWords() {
        HashSet<String> repeated = new HashSet<>();

        for (int i = 0; i < arrayList.size() - 1; i++) {
            int count = 1;

            if (repeated.contains(arrayList.get(i)))
                continue;

            for (int j = 1 + i; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    count++;
                    repeated.add(arrayList.get(i));
                }
            }

            System.out.println("Word " + arrayList.get(i) + " was repeated " + count + " times.");
        }
    }
}