package com.solutions;

/**
 * @author ASilentFigure
 * @project SwordFingerOffer
 * @date 2023/3/21 11:19
 */
public class CountBits {

    public int [] countBits1(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int j = i;
            while (j != 0) {
                result[i]++;
                result[i] = Integer.bitCount(i);
                j = j & (j - 1);
            }
        }

        return result;
    }

    public int [] countBits2(int num) {
        int [] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }

        return result;
    }

    public int [] countBits3(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }
}
