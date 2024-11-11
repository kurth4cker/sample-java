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
        var sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
