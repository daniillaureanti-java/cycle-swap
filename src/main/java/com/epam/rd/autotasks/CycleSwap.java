package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length > 1) {

            int lastIndex = array.length - 1;
            int oldLast = array[lastIndex];
            for (int i = lastIndex; i != 0; i--)
                array[i] = array[i - 1];

            array[0] = oldLast;
        } else array = null;


    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length > 1) {
            for (int j = 0; j < shift; j++) {
                int lastIndex = array.length - 1;
                int oldLast = array[lastIndex];
                for (int i = lastIndex; i != 0; i--)
                    array[i] = array[i - 1];

                array[0] = oldLast;

            }
        }

    }
}
