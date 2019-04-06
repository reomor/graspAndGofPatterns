package gof.creational.singleton;

/*
thx to
https://habr.com/ru/post/129494/
https://sites.google.com/site/io/effective-java-reloaded
https://sites.google.com/site/io/effective-java-reloaded/effective_java_reloaded.pdf?attredirects=0
 */
public class Client {
    public static void main(String[] args) {
        final ClassicNonLazySingleton classicNonLazySingleton = ClassicNonLazySingleton.INSTANCE;
        classicNonLazySingleton.act();

        final EnumNonLazySingleton enumNonLazySingleton = EnumNonLazySingleton.INSTANCE;
        enumNonLazySingleton.act();

        final SynchronizedLazyAccessorSingleton synchronizedLazyAccessorSingleton = SynchronizedLazyAccessorSingleton.getInstance();
        synchronizedLazyAccessorSingleton.act();

        final DoubleCheckedLockingVolatileLazySingleton doubleCheckedLockingVolatileLazySingleton = DoubleCheckedLockingVolatileLazySingleton.getInstance();
        doubleCheckedLockingVolatileLazySingleton.act();

        final OnDemandHolderIdiomLazySingleton onDemandHolderIdiomLazySingleton = OnDemandHolderIdiomLazySingleton.getInstance();
        onDemandHolderIdiomLazySingleton.act();
    }
}
