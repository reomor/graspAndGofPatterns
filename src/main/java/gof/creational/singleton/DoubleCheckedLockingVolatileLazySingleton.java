package gof.creational.singleton;

/*
+ Ленивая инициализация
+ Высокая производительность
- Поддерживается только с JDK 1.5
 */
public class DoubleCheckedLockingVolatileLazySingleton {
    private static volatile DoubleCheckedLockingVolatileLazySingleton instance;

    public static DoubleCheckedLockingVolatileLazySingleton getInstance() {
        DoubleCheckedLockingVolatileLazySingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingVolatileLazySingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedLockingVolatileLazySingleton();
                }
            }
        }
        return localInstance;
    }

    private String doUsefulActions() {
        return "Useful actions";
    }

    public void act() {
        System.out.println(doUsefulActions());
    }
}
