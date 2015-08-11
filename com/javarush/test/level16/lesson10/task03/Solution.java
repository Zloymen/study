package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread th = new TestThread();
        th.start();
        th.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public TestThread() {

        }
        public  void run()
        {
            while(true)
            {
                if(this.isInterrupted()) return;
            }
        }
    }
}
