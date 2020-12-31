package com.godOfJava2.c21;


import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {
    private T object;

    public void setObject(T obj) {
        this.object = obj;
    }

    public T getObject() {
        return object;
    }
    // 제네릭을 사용해 CastingDTO를 다시 선언한 코드.
    // 제네릭 generic : 타입 형변환에서 발생할 수 있는 문제를 사전에 없애기 위해 개발됨. 실행시가 아닌 컴파일할 때 점검할 수 있도록 함.
    // T 자리에는 아무 이름이나 지정해도 되지만, 되도록 클래스 명명규칙과 동일하게 하는 것이 좋다. 꺾쇠 안의 이름은 가상의 타입이름이다.
}
