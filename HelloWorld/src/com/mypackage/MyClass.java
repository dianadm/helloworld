package com.mypackage;

import com.oracle.webservices.internal.api.databinding.Databinding;

/**
 * Created by dmigasiuk on 2015-06-15.
 */
public class MyClass {
    public MyClass(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.e = builder.e;
        this.d = builder.d;
    }

    private int a;
    private int b;
    private int c;
    private String d;
    private String e;



    public static class Builder {

        private final int a;
        private int b = 0;
        private int c = 0;
        private String d = "d";
        private String e = "e";

        public Builder(int a) {
            this.a = a;
        }

        public Builder setB(int num) {
            this.b = num;
            return this;
        }

        public Builder setC(int num) {
            this.c = num;
            return this;
        }

        public Builder setD(String str) {
            this.d = str;
            return this;
        }

        public Builder setE(String str) {
            this.e = str;
            return this;
        }

        public MyClass build() {
            return new MyClass(this);
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                '}';
    }
}
