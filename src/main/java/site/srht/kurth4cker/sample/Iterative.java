// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.sample;

public final class Iterative {
    private Iterative() {}

    public static String intToString(int val) {
        if (val == 0) {
            return "0";
        }

        // TODO: implement multi digit parsing
        return String.valueOf((char) ('0' + val));
    }

    public static String reversed(String str) {
        var array = new char[str.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(array.length - i - 1);
        }

        return new String(array);
    }
}
