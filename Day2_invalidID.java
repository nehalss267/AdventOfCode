import java.util.*;
import java.io.*;

public class Day2_invalidID {
    static int count = 0;
    static Long sum = 0L;
    // static Set<Long> invalidIDList = new HashSet<>();
    static List<Long> invalidIDList = new ArrayList<>();

    public static void doubleSequence(String data) {
        int len = data.length();
        if ((len % 2) != 0) {
            return;
        }
        String l = data.substring(0, (len / 2));
        String r = data.substring((len / 2));
        if (!l.equals(r)) {
            return;
        }
        Long LongData = Long.parseLong(data);
        invalidIDList.add(LongData);

    }

    public static void range(String data) {
        String dataArr[] = data.split("-");
        for (long i = Long.parseLong(dataArr[0]); i <= Long.parseLong(dataArr[1]); i++) {
            doubleSequence(String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        String data = " ";
        File input = new File("F:\\1-sem4\\DSA\\CodingChallenges\\AdventOfCode_local\\input2.txt");
        try (Scanner sc = new Scanner(input)) {
            while (sc.hasNextLine()) {
                data = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        String dataArr[] = new String[data.length()];

        dataArr = data.split(",");// 0 of arr
        for (String elem : dataArr) {
            range(elem);
        }

        for (Long elem : invalidIDList) {
            sum += elem;
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(invalidIDList);
    }
}
