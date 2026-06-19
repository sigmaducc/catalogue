package test_utils;

import java.io.*;
import java.util.*;

public class InputUtil {

    public static int[] readIntArray(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line = br.readLine().trim();

            // Handle LeetCode style: [1,2,3]
            if (line.startsWith("[") && line.endsWith("]")) {
                line = line.substring(1, line.length() - 1); // remove [ ]

                if (line.isEmpty()) return new int[0];

                return Arrays.stream(line.split(","))
                        .map(String::trim)
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            // Handle space-separated: 1 2 3
            return Arrays.stream(line.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        } catch (Exception e) {
            throw new RuntimeException("Error reading array from file", e);
        }
    }

    public static String readLine(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            return br.readLine().trim();
        } catch (Exception e) {
            throw new RuntimeException("Error reading array from file", e);
        }
    }
}