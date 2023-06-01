package org.nocoder.designpattern.command;

/**
 * 知道如何实施与执行一个请求相关的操作，任何类都可能作为一个接收者
 */
public class Receiver {
    public void action() {
        System.out.println("处理请求.");
    }
}

