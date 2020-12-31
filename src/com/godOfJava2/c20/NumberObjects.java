package com.godOfJava2.c20;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();
        numberObjects.parseLong("010");
        numberObjects.printOtherBase(1024);
    }

    public long parseLong(String data) {
        long result;
        try {
            result = Long.parseLong(data);
            System.out.println(result);
            return result;
        } catch (NumberFormatException e) { // data가 숫자가 아닌 문자열일 떄
            System.out.println(data + " is not a number.");
            return -1;
        }
    }

    public void printOtherBase(long value) {
        String binaryVal = Long.toBinaryString(value);
        String hexVal = Long.toHexString(value);
        String octalVal = Long.toOctalString(value);
        System.out.println("Original : " + value);
        System.out.println("Binary : " + binaryVal);
        System.out.println("Hex : " + hexVal);
        System.out.println("Octal : " + octalVal);
    }
}
