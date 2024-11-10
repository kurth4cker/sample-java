// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

public final class Hello {
    private Hello() {
    }

    public static String format(String to) {
        return String.format("hello %s", to);
    }
}
