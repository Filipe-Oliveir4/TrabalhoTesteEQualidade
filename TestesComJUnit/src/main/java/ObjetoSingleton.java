public class ObjetoSingleton {
    private static ObjetoSingleton instance = null;
    private ObjetoSingleton() {
    }
    public static ObjetoSingleton getInstance() {
        if (instance == null) {
            instance = new ObjetoSingleton();
        }
        return instance;
    }
}
