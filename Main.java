package com.maktab25.hw4.torabi.practice1;

public class Main {
    public static void main(String[] args) {
        MessageCoder messageCoder = new MessageCoder("THE REDCOATS ARE COMING! ", +5);
        System.out.println(messageCoder.encryptAll());
    }
}
