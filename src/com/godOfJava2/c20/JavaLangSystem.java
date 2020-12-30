package com.godOfJava2.c20;

public class JavaLangSystem {
    // System 클래스 : 시스템에 대한 정보를 확인하는 클래스.

    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        //sample.systemPropertiesCheck();
        //sample.systemEnvironmentCheck();
        sample.numberMinMaxElapsedCheck();
    }

    public void systemPropertiesCheck() {
        System.out.println("java.version = " + System.getProperty("java.version"));
    }
    // 시스템 속성값(Property) 관리 메소드 - Properties라는 클래스를 알아야 한다. (Hashtable을 상속받은 클래스 - key, value사용)
    // System.getProperty(String key) : key에 지정된 문자열로 된 시스템 속성값을 얻는다.
    // 예제에서는 "java.version"이라는 key를 통해 시스템 속성값을 가져왔음.

    public void systemEnvironmentCheck() {
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
    }
    // 시스템 환경값(Environment) 조회 메소드 - 환경값은 OS 및 장비와 관련되며, 변경하지 못하고 읽기만 할 수 있다.
    // System.getenv(name) : 지정한 name에 해당하는 값을 받는다. JAVA_HOME은 JDK의 설치경로를 나타낸다.

    public void numberMinMaxElapsedCheck() {
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        numberSample.numberMinMaxCheck();
        System.out.println("Milli second = " + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second = " + (System.nanoTime() - startNanoTime));
        // 현재 시간 조회 및 시간 측정 메소드
        // currentTimeMillis() : 현재 시간을 밀리초 단위로 리턴. 현재시간 조회할 때 사용. 밀리초 = 1 / 1,000초.
        // nanoTime() : 현재 시간을 나노초 단위로 리턴. 시간차를 측정할 때 사용. 나노초 = 1 / 1,000,000,000초.
        // 위 예제는 JavaLangNumber클래스의 numberMinMaxCheck()메소드 작업이 얼마나 소요되는지 확인하는 코드이다.
    }
}
