package collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<SameHash, Integer> map = new HashMap<>();


        for (int i = 0; i < 20; i++) {
            map.put(new SameHash(), i);
        }

        System.out.println(1);


    }

    static class SameHash {
        @Override
        public int hashCode() {
            return 1;
        }
    }


}
