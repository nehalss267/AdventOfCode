// Puzzle link: https://x.com/intent/tweet?text=%22Secret+Entrance%22+%2D+Day+1+%2D+Advent+of+Code+2025&url=https%3A%2F%2Fadventofcode%2Ecom%2F2025%2Fday%2F1&related=ericwastl&hashtags=AdventOfCode

import java.util.*;
import java.io.*;

class Day1_Password {
    static int count = 0;
    static int currentPosition = 50;

    public static void decrypt(String input) {
        int numIn = 0, numIn1 = 0;
        char dir = ' ';
        numIn = Integer.parseInt(input.replaceAll("[A-Z]", ""));
        numIn = numIn % 100;
        dir = input.charAt(0);
        if (dir == 'L') {
            currentPosition = currentPosition + 100 - numIn;
        } else if (dir == 'R') {
            currentPosition += numIn;
        }
        currentPosition %= 100;
        if (currentPosition == 0) {
            count++;
        }
    }

    public static void main(String[] args) {
        File input = new File("C:/CodingChallenges/AdventOfCode/input.txt");//place input.txt file path
        int currentPositionOfLines = 0;
        String data = " ";
        try (Scanner sc = new Scanner(input)) {
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                currentPositionOfLines++;
                decrypt(data);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not found " + e);
        }
        System.out.println(count);

    }

}
