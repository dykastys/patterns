package creational.builder;

public class Account {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    static class Builder {

        private final Account newAccount;

        public Builder() {
            this.newAccount = new Account();
        }

        public Builder setAccountName(String name) {
            this.newAccount.name = name;
            return this;
        }

        public Builder setAccountPassword(String password) {
            this.newAccount.password = password;
            return this;
        }

        public Account build() {
            return newAccount;
        }
    }
}
