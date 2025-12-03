import java.util.*;
import java.io.*;

public class Day2_invalidID_palindrome {
    static int count = 0;
    static long sum = 0L;
    static Set<Long> invalidIDList = new HashSet<>();

    public static void palindrome(String data) {
        int len = data.length();
        Long longData = 0L;
        int l = 0;
        int r = len - 1;
        while (l != (len - 1) || r != 0) {
            if (data.charAt(l) != data.charAt(r)) {
                return;
            }
            l++;
            r--;
        }
        longData = Long.parseLong(data);
        sum += longData;
        invalidIDList.add(longData);
        // for (long elem : invalidIDList) {
        // sum += elem;
        count++;
        // }
    }

    public static void range(String data) {
        int iter = 0, dashPosition = 0;
        int len = data.length();
        String start = " ", end = " ";
        while (iter != (len - 1)) {
            if (data.charAt(iter) == '-') {
                dashPosition = iter;
                break;
            }
            iter++;
        }

        start = data.substring(0, dashPosition);
        end = data.substring(dashPosition + 1, len);
        // System.out.println(start + " " + dashPosition + " " + end);
        for (long i = Long.parseLong(start); i <= Long.parseLong(end); i++) {
            palindrome(String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        String data = " ";
        String dataArr[] = new String[data.length()];
        File input = new File("F:\\1-sem4\\DSA\\CodingChallenges\\AdventOfCode_local\\input2.txt");
        try (Scanner sc = new Scanner(input)) {
            while (sc.hasNextLine()) {
                data = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        dataArr = data.split(",");// 0 of arr
        for (String elem : dataArr) {
            range(elem);
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(invalidIDList);
    }
}
