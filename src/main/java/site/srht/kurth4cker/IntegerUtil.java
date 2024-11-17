// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

public class IntegerUtil {
    private IntegerUtil() {}

    public static boolean isPowerOfTwo(int num) {
        if (num == 0) {
            return false;
        }
        num = Math.abs(num);
        return (num & (num - 1)) == 0;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (var i : new int[]{2, 3, 5, 7}) {
            if (num != i && num % i == 0) {
                return false;
            }
        }

        for (int i = 7; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
