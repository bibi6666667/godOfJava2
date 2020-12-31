package com.godOfJava2.c20;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();

        numberObjects.parseLong("r1024");
        numberObjects.parseLong("1024");
        numberObjects.printOtherBase(1024);
    }

    public long parseLong(String data) {
        long result = -1; // 에러일 때 리턴할 값 설정
        try {
            result = Long.parseLong(data); // 정상적일 때만 새로운 값 할당
            System.out.println(result);
        } catch (NumberFormatException ne) { // data가 숫자가 아닌 문자열일 떄
            System.out.println(data + " is not a number.");
        } catch (Exception e) {

        }
        return result; // 정상적일 때는 할당된 값을, 에러일 때는 -1 리턴
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
