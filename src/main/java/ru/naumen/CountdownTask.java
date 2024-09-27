package ru.naumen;

public class CountdownTask implements Task {

    private int time;
    private boolean running;

    public CountdownTask(int time) {
        this.time = time;
    }

    @Override
    public void start() {
        running = true;
        new Thread(() -> {
            try {
                while (time > 0 && running) {
                    System.out.println("Осталось: " + time + " секунд");
                    time--;
                    Thread.sleep(1000); // Ожидание 1 секунды
                }
                if (time == 0) {
                    System.out.println("Таймер завершен!");
                }
            } catch (InterruptedException e) {
                System.out.println("Таймер был прерван.");
            }
        }).start(); // Запускаем таймер в отдельном потоке
    }

    // Реализация метода stop() для остановки таймера
    @Override
    public void stop() {
        running = false;
        System.out.println("Таймер остановлен.");
    }
}