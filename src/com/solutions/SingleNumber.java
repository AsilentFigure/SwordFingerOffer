package com.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ASilentFigure
 * @project SwordFingerOffer
 * @date 2023/3/21 16:15
 */
public class SingleNumber {

    int[] bitSums = new int[32];

    public int singleNumber1(int[] nums) {
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitSums[i] += (num >> (31 - i)) & 1;
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + bitSums[i] % 3;
        }

        return result;
    }

    public int singleNumber2(int[] nums, int n, int m) {

        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitSums[i] += (num >> (31 - i)) & 1;
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + bitSums[i] % n;
        }

        return result / m;
    }

    // 此代码由chatgpt得出
    public static int findUniqueNumber(int[] array, int n, int m) {
        Map<Integer, Integer> map = new HashMap<>();

        // 统计数字出现的次数
        for (int num : array) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }

        // 找到唯一出现m次的数字
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == m) {
                return entry.getKey();
            }
        }

        // 未找到符合条件的数字
        return -1;
    }




}
