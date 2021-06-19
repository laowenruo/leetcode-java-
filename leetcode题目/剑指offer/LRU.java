package leetcode题目.剑指offer;
import java.util.*;

public class LRU {
        /**
         * lru design
         * @param operators int整型二维数组 the ops
         * @param k int整型 the k
         * @return int整型一维数组
         */
        public int[] LRU (int[][] operators, int k) {
            // write code here
            Map<Integer, Integer> map = new LinkedHashMap<>(k,0.75f,true);
            List<Integer> list = new ArrayList<>();
            for (int[] operator : operators) {
                int key = operator[1];
                switch(operator[0]) {
                    case 1:
                        int value = operator[2];
                        if (map.size() < k) {
                            map.put(key, value);
                        } else {
                            Iterator it=map.keySet().iterator();
                            map.remove(it.next());
                            map.put(key, value);
                        }
                        break;
                    case 2:
                        if (map.containsKey(key)) {
                            int val = map.get(key);
                            list.add(val);
                            map.remove(key);
                            map.put(key, val);
                        } else {
                            list.add(-1);
                        }
                        break;
                    default:
                }
            }
            int[] res = new int[list.size()];
            int i = 0;
            for (int val : list) {
                res[i++] = val;
            }
            return res;
        }
    }
