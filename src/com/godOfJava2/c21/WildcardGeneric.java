package com.godOfJava2.c21;

public class WildcardGeneric<W> { // 제네릭 클래스
    W wildcard;

    public void setWildcard(W wildcard) { // 제네릭을 메소드의 매개변수로 넘기기
        this.wildcard = wildcard;
    }

    public W getWildcard() {
        return wildcard;
    }
}
