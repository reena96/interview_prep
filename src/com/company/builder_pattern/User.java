package com.company.builder_pattern;


class User {
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder addAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder addPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder addAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

//    public static User getUser() {
//        return new User.UserBuilder("Jhon", "Doe").build();
//    }
}
class Demo {


    public static void main(String[] args){
       // User.UserBuilder user = new User.UserBuilder("sai","sharan");
        User.UserBuilder userBuilder = new User.UserBuilder("sai","sharan");
        User user1 = userBuilder
                .addAge(30)
                .addPhone("1234567")
                .addAddress("1011 MDA")
                .build();

        User user2 = new User.UserBuilder("Reena","Mary")
                .addAge(30)
                .addPhone("1234567")
                .addAddress("501 MDA")
                .build();

//        System.out.println("Age: "+user1.getFirstName()  );
//        System.out.println("Phone: "+user2.getPhone()  );
//        System.out.println("Address: "+user2.getAddress()  );
        System.out.println();
    }
}
