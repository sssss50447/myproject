package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello word");
        Person p = new Person("Ryuu", 66.5f,1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score >90);
        char c ='A';
        System.out.println(c> 'a');
       /* int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";*/
    }
}
