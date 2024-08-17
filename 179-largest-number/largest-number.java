class Solution {
    public String largestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsStr, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        if (numsStr[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNum = new StringBuilder();
        for (String num : numsStr) {
            largestNum.append(num);
        }

        return largestNum.toString();
    }
}
