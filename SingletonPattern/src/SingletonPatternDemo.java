public class SingletonPatternDemo {
    /**
     Singleton ensures that class can have only one instance
      and provides global access to it (to that single instance)
      Using static method we check: is first and only instance is created (lazy variant)

     - EagerSingleton - Singleton Will be instantiated during class loading.
        ( private static Singleton instance = new Singleton(); )
        Thread save hread safe means, it doesn’t matter how many threads are trying to invoke getInstance() method,
        they’ll always get that one object which is created eagerly.

     - LazySingleton only get instantiated when someone will invoke the getInstance() method. It’ll check if it’s null
     */
    public static void main(String[] args) {
//        Singleton singleton = new Singleton(); <= This is not possible

        //Both have one instance
        SingletonLazy singleton1 = SingletonLazy.getInstance();
        SingletonLazy singleton2 = SingletonLazy.getInstance();

    }
}
