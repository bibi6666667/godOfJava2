package com.godOfJava2.c21;

public class GenericSample {

    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
    }

    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());
        // CastingDTO의 private 변수의 타입, Object는 모든 클래스의 부모 클래스이므로 setter()에 어떤 타입을 매개변수로 넘겨도 상관이 없다.

        String temp1 = (String)dto1.getObject();
        StringBuffer temp2 = (StringBuffer)dto2.getObject();
        StringBuilder temp3 = (StringBuilder)dto3.getObject();
        // 하지만 저장된 값을 꺼낼 때, getter()의 리턴값은 Object이기 때문에 각각 형변환을 해 주어야 한다.
        // 이 때 dto의 인스턴스변수의 타입이 무엇인지 헷갈릴 때는 instanceof라는 예약어를 활용한다. - checkDTO()와 같이.
    }

    public void checkDTO(CastingDTO dto) {
        Object tempObject = dto.getObject();
        if (tempObject instanceof StringBuilder) {
            System.out.println("StringBuilder");
        } else if (tempObject instanceof StringBuffer) {
            System.out.println("StringBuffer");
        }
    }
}
