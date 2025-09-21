package Leetcode;

public class AddBinary {
    public static String addBinary(String a, String b) {
        // 11 // 11
        StringBuilder finalVal = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if(i >= 0) {
                char c = a.charAt(i);
                int val = c - '0'; // 49 - 48 = 1
                sum += val;
                i--;
            }

            if(j >= 0) {
                char c = b.charAt(j);
                int val = c - '0';
                sum += val;
                j--;
            }

            int binaryVal = sum % 2;  // rem = 0, quo = 1 // 011
            carry = sum / 2;
            finalVal.append(binaryVal);
        }

        return finalVal.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "11"));
    }
}
