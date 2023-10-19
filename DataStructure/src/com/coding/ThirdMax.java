package com.coding;

public class ThirdMax {

    private  static int thirdMax(int[] nums)
    {
        Integer firstMax=Integer.MIN_VALUE,secMax=Integer.MIN_VALUE,thirdMax=Integer.MIN_VALUE;
      for (int num:nums)
      {
          if(num>firstMax)
          {
              thirdMax=secMax;
              secMax=firstMax;
              firstMax=num;
          } else if (num > secMax && num < firstMax) {
              thirdMax=secMax;
            secMax=num;

          }
          else if (num>thirdMax && num<secMax)
          {
              thirdMax=num;
          }

      }
      return thirdMax==Integer.MIN_VALUE?firstMax:thirdMax;
    }
    public static int thirdMax1(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
           if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
    public static void main(String[] args) {
        int[] nums={1,2,-2147483648};

        ;
        System.out.println(thirdMax1(nums));

    }
}
