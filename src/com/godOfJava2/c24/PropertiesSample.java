package com.godOfJava2.c24;

import java.util.Properties;
import java.util.Set;

//Properties클래스로 파일IO를 수행하기 위해 import해야 하는 클래스.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        //sample.checkProperties();
        //sample.saveAndLoadProperties();
        sample.saveAndLoadPropertiesXML();
    }

    public void checkProperties() {
        // Properties클래스 : 자바에서 시스템의 속성을 제공하는 클래스.
        Properties prop = System.getProperties();
        // getProperties() : System클래스의 static메소드 중 하나로, Properties타입의 객체를 리턴함.
        Set<Object> keySet = prop.keySet(); // prop의 keySet을 Set에 담아 출력.
        for (Object tempObject : keySet) {
            System.out.println(tempObject + "=" + prop.get(tempObject));
        }
    }

    // .properties 확장자인 설정 파일 만들기
    public void saveAndLoadProperties() { 
        try {
            String fileName = "test.proterties";
            File propertiesFile = new File(fileName); // File : 파일을 다룰 때 사용.
            FileOutputStream fos = new FileOutputStream(propertiesFile); // FileOutputStream : 파일에 저장할 때 사용.
            Properties prop = new Properties(); // 속성을 지정해 파일에 작성하는 부분.
            prop.setProperty("Writer", "Sangmin, Lee");
            prop.setProperty("WriterHome", "http://www.GodOfJava.com");
            prop.store(fos, "Basic Proterties file.");
            fos.close();
            FileInputStream fis = new FileInputStream(propertiesFile); // FileInputStream : 파일에서 읽을 때 사용.
            Properties propLoaded = new Properties();// 파일에서 속성을 읽는 부분.
            propLoaded.load(fis);
            fis.close();
            System.out.println(propLoaded); // Hashtable에 toString()이 구현되어 있어 Properties객체를 출력해도 잘 출력된다.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /// .XML 퐉장자의 설정 파일 만들기
    public void saveAndLoadPropertiesXML() {
        try {
            String fileName = "test.xml";
            File propertiesFile = new File(fileName); // File : 파일을 다루는 클래스
            FileOutputStream fos = new FileOutputStream(propertiesFile); // FileOutputStream : 파일에 저장할 때 사용하는 클래스
            Properties prop = new Properties(); // 파일에 속성을 지정 및 작성하는 부분.
            prop.setProperty("Writer", "Sangmin, Lee");
            prop.setProperty("WriterHome", "http://www.GodOfJava.com");
            prop.storeToXML(fos, "Basic XML Property file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile); // FileInputStream : 파일에서 읽을 때 사용하는 클래스
            Properties propLoaded = new Properties();
            propLoaded.loadFromXML(fis);
            System.out.println(propLoaded);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
