import java.util.ArrayList;
import java.util.List;
public class CODEWARS {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int result = josephusSurvivor(n, k);
        System.out.println(result);//4
        n = 11;
        k = 19;
        result = josephusSurvivor(n, k);
        System.out.println(result);//10
        n = 40;
        k = 3;
        result = josephusSurvivor(n, k);
        System.out.println(result);//28
        n = 14;
        k = 2;
        result = josephusSurvivor(n, k);
        System.out.println(result);//13
        n = 100;
        k = 1;
        result = josephusSurvivor(n, k);
        System.out.println(result);//100
    }
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> list = new ArrayList<>();
        int index = -1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        while(list.size() > 1) {
            index = (index + k) % list.size();
            list.remove(index);
            index -= 1;
        }
        return list.get(0);
    }
}