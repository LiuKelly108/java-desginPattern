package com.kellystudy.pattern.adapter.reconstructionklogin.v2;

public class PassportAdapterTest {

    public static void main(String[] args) {
      IPassportForThird  passportForThird = new   PassportForThirdAdapter();
      passportForThird.loginForQQ("525252");
    }
}
