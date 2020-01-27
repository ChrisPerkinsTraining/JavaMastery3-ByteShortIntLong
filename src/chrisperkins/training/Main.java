package chrisperkins.training;

public class Main {

    public static void main(String[] args) {

        byte myByte = 18;

        short myShort = 27365;

        int myInt = 2809238;

        long myLong = ((myByte + myShort + myInt) * 10L) + 50000L;

        short myDerivedShort = (short) (((myByte + myShort + myInt) * 10) + 50000);

        System.out.println("My Long: " + myLong);
    }
}
