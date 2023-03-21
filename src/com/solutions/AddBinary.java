package com.solutions;

/**
 * @author ASilentFigure
 * @project SwordFingerOffer
 * @date 2023/3/21 10:04
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int digitA = i >= 0 ? a.charAt(i--) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            result.append(sum);
        }

        if(carry == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }

    // 此代码来自于chatgpt
    public String binaryAddition(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length()-1, j = num2.length()-1;
        while(i>=0 || j>=0 || carry!=0){
            int sum = carry;
            if(i >= 0) sum += num1.charAt(i--) - '0';
            if(j >= 0) sum += num2.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }

}
