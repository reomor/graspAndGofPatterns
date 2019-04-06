package gof.creational.singleton;

/*
+ Сериализация из коробки
+ Потокобезопасность из коробки
+ Возможность использования EnumSet, EnumMap и т.д.
+ Поддержка switch
- Не ленивая инициализация
 */
public enum EnumNonLazySingleton {
    INSTANCE;

    private String doUsefulActions() {
        return "Useful actions";
    }

    public void act() {
        System.out.println(doUsefulActions());
    }
}
