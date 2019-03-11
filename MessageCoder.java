package com.maktab25.hw4.torabi.practice1;

public class MessageCoder {
    private String message;
    private int code;

    MessageCoder(String s, int code) {
        message = s;
        this.code = code;

    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    private char encrypt(int i) {
        char ch = ' ';
        if (message.charAt(i) != ' ')
            return (char) (((int) message.charAt(i)) + code);
        else
            return ch;

    }

    String encryptAll() {
        char[] ch = new char[message.length()];
        for (int i = 0; i < message.length(); i++)
            ch[i] = encrypt(i);
        return new String(ch);
    }
}
