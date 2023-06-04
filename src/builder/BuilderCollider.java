package builder;

/*
* Построитель - для более понятной инициализации объектов со значительным количество полей
* вместо множества конструкторов
* */
public class BuilderCollider {

    public static void main(String[] args) {
        Account account = new Account.Builder()
                .setAccountName("accountName")
                .setAccountPassword("accountPassword")
                .build();

        System.out.println(account);
    }
}
