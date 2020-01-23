package chrisperkins.training;

public class Main {

    public static void main(String[] args) {

        // Int Width = 32 bits

        int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinValue );
        System.out.println("Integer Maximum Value = " + myMaxValue );

        System.out.println("Busted Max Value = " + (myMaxValue + 1));
        System.out.println("Busted Max Value = " + (myMinValue - 1));

        int myMaxIntTest = 2_147_483_647;

        // Bytes Width = 8 bits

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // Shorts Width = 8 bits

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //Long Width =

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLitteralValue = 2_147_483_647_234L;

        System.out.println(bigLongLitteralValue);

        short bigShortLitteralValue = 32767;

    }
}
