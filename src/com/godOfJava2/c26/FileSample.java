package com.godOfJava2.c26;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "C:\\Users\\rnala\\practice\\godOfJava2\\test";
        // String pathName2 = File.separator + "godOfJava2"; // File.separator : 디렉터리구분기호
        //sample.checkPath(pathName);
        //sample.makeDir(pathName);
        //sample.checkFileMethods(pathName);
        //sample.canFileMethods(pathName);
        sample.lastModified(pathName);
    }

    public void checkPath(String pathName) {
        File file = new File(pathName); // 경로로 File 객체 생성해 사용.
        System.out.println(pathName + " is exists? = " + file.exists()); // 해당 경로 존재여부 확인
    }

    public void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make "  + pathName + " result = " + file.mkdir());
        // 디렉토리를 만듦
    }
    
    public void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is directory? = " + file.isDirectory()); // File객체가 경로(디렉토리)인지 확인
        System.out.println(pathName + " is file? = " + file.isFile()); // File 객체가 파일인지 확인
        System.out.println(pathName + " is hidden? = " + file.isHidden()); // File객체가 숨김파일인지 확인
    }

    public void canFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " can read? = " + file.canRead()); // File객체 읽을 권한이 있는지
        System.out.println(pathName + " can write? = " + file.canWrite()); // File 객체 쓸 권한이 있는지
        System.out.println(pathName + " can execute? = " + file.canExecute()); // File 객체 실행 권한이 있는지
    }

    public void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
    }


}
