package org.example;
// firstName and lastName required field
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int phoneNumber;
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private int phoneNumber;
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public User build() {
            if(firstName == null || lastName == null) {
                throw new IllegalStateException("Missing required fields: firstName and lastName");
            }
            return new User(this);
        }
    }
    public String toString() {
        return "firstName "+firstName + " lastName "+ lastName + " age "+age + " phone "+phoneNumber;
    }
}
