package gof.creational.singleton;

/*
+ Ленивая инициализация
- Низкая производительность (критическая секция)
 */
public class SynchronizedLazyAccessorSingleton {
    private static SynchronizedLazyAccessorSingleton instance;

    public static synchronized SynchronizedLazyAccessorSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazyAccessorSingleton();
        }
        return instance;
    }

    private String doUsefulActions() {
        return "Useful actions";
    }

    public void act() {
        System.out.println(doUsefulActions());
    }
}
