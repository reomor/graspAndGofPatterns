package gof.creational.singleton;

/*
+ Ленивая инициализация
+ Высокая производительность
- Невозможно использовать для не статических полей класса
 */
public class OnDemandHolderIdiomLazySingleton {
    private static class SingletonHolder {
        public static final OnDemandHolderIdiomLazySingleton HOLDER_INSTANCE = new OnDemandHolderIdiomLazySingleton();
    }

    public static OnDemandHolderIdiomLazySingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private String doUsefulActions() {
        return "Useful actions";
    }

    public void act() {
        System.out.println(doUsefulActions());
    }
}
