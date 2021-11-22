public final class SingletonLazy {

    private static SingletonLazy singletonInstance;

    private SingletonLazy(){
        System.out.println("Singleton being initialized");
    }

    static SingletonLazy getInstance(){
        if (singletonInstance == null){
            singletonInstance = new SingletonLazy();
        }
        return singletonInstance;
    }
}
