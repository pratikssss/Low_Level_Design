package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder().firstName("pratik").lastName("mahajan").build();
        User user2 = new User.UserBuilder().firstName("john").lastName("snow").age(23).phoneNumber(909090).build();
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        BuilderTest buildertest = new BuilderTest.builder().setId(1).setName("pra").build();
    }
}

//What it is: It allows you to construct complex objects step by step.
// Instead of having a constructor with 15 parameters (where you easily forget the order and pass null to half of them), you use a Builder class to chain methods together.
//When to use it in interviews: When an object has many optional attributes. Examples: Creating a User profile (where phone, address, and age are optional) or building an HttpRequest.