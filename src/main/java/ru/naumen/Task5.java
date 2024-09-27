package ru.naumen;

public class Task5 {
    /**
     * Реализуйте интерфейс “Task” для выполнения функции обратного
     * отсчёта таймера. Таймер должен начинаться с заданного значения и
     * уменьшаться каждую секунду до нуля, печатая остаток времени в консоль.
     * При вызове метода start() таймер начинает свою работу, при вызове метода
     * stop() таймер останавливается. Для выполнения задания рекомендуется
     * использовать метод “java.lang.Thread#sleep(long)”.
     * @throws InterruptedException
     */
    public static void task5() throws InterruptedException {
        CountdownTask timer = new CountdownTask(10);
        timer.start();
        Thread.sleep(5000);
        timer.stop();
    }

    public static void main(String[] args) throws InterruptedException {
        task5();
    }
}
