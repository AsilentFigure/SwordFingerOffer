package com.solutions;

/**
 * @author ASilentFigure
 * @project SwordFingerOffer
 * @date 2023/3/21 11:19
 */
public class CountBits {

    public int [] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int j = i;
            while (j != 0) {
                result[i]++;
                j = j & (j - 1);
            }
        }

        return result;
    }
}
