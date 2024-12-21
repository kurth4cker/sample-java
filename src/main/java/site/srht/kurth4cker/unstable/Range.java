// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.unstable;

import java.util.NoSuchElementException;

public record Range(int start, int end) implements Iterable<Integer> {
    public Range(int end) {
        this(0, end);
    }

    private class Iterator implements java.util.Iterator<Integer> {
        private int index;

        public Iterator() {
            this.index = Range.this.start;
        }

        @Override
        public boolean hasNext() {
            return this.index < Range.this.end;
        }

        @Override
        public Integer next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException(Integer.toString(this.index));
            }
            return this.index++;
        }
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new Range.Iterator();
    }
}
