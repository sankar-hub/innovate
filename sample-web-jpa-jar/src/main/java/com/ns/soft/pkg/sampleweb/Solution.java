package com.ns.soft.pkg.sampleweb;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int valleyCount = 0;
		int upSkillsCount = 0;
		int downSkillsCount = 0;
		boolean isUpHillFirst = false;
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'U') {
				if (upSkillsCount == 0 && downSkillsCount == 0) {
					isUpHillFirst = true;
				}
				upSkillsCount++;
			} else if (c[i] == 'D') {
				downSkillsCount++;
			}
			if (upSkillsCount - downSkillsCount == 0) {
				upSkillsCount = 0;
				downSkillsCount = 0;
				if (!isUpHillFirst) {
					valleyCount += 1;
				} else if (isUpHillFirst) {
					isUpHillFirst = false;
				}
			}
		}
		System.out.println(valleyCount);
		return valleyCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}
