package singleton;

/*
* Создание единственного объекта класса
* */
public class SingletonCollider {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
