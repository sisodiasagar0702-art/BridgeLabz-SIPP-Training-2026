import java.util.HashSet;

public class CountFreqUsingHashSet {
    public static void main(String[] args) {

        int arr[] = {1, 22, 31, 22, 1, 5};

        HashSet<Integer> set = new HashSet<>();

        // Unique elements store karo
        for (int a : arr) {
            set.add(a);
        }

        // Har unique element ki frequency count karo
        for (int num : set) {
            int freq = 0;

            for (int a : arr) {
                if (a == num) {
                    freq++;
                }
            }

            System.out.println(num + " ki freq hai : " + freq);
        }
    }
}