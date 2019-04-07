package gof.creational.singleton;

/*
+ Простая и прозрачная реализация
+ Потокобезопасность
- Не ленивая инициализация
 */
public class ClassicNonLazySingleton {
    public static final ClassicNonLazySingleton INSTANCE = new ClassicNonLazySingleton();

    private String doUsefulActions() {
        return "Useful actions";
    }

    public void act() {
        System.out.println(doUsefulActions());
    }
}
