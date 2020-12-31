package com.godOfJava2.c21;

import java.io.Serializable;

public class CastingDTO implements Serializable{
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
    // DTO : Data Transfer Object
    // 이 코드와 같이 'private 변수, getter, setter, Serializable' 구현을 해야만 제대로 된 DTO클래스라고 할 수 있다.
    // private변수 : private로 선언한 객체
    // getter, setter : get변수이름() 메소드, set변수이름()메소드.
    // Serializable : java.io 에서 import한 인터페이스.
}
