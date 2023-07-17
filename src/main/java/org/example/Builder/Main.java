package org.example.Builder;

public class Main {

public static void main(String args[])
    {
        randomClass rc = new randomClassBuilder()
                .firstAttribute("first")
                .secondAttribute("second")
                .build();
        rc.print();
    }
}
