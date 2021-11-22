public final class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager()
    {
        System.out.println("Singleton being initialized");
    }

    public static SingletonEager getInstance()
    {
        return instance;
    }
}
