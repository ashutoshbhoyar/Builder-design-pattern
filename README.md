# Builder-design-pattern

This code is a good example of the Builder design pattern in Java. The User class is the product class, and the UserBuilder class is the builder class.

The UserBuilder class has a fluent interface, which means that its methods can be chained together to create a new User object step-by-step. This makes it easy to create complex User objects without having to pass all of the parameters to a constructor.

To create a new User object, you first create a new UserBuilder object. Then, you call the setUserId(), setUserName(), and setEmailId() methods to set the values of the User object's fields. Finally, you call the build() method to create the new User object.

The following example shows how to create a new User object using the UserBuilder class:

User user = new User.UserBuilder()
    .setEmailId("ashutoshbh100@gmail.com")
    .setUserId(123)
    .setUserName("ashutosh")
    .build();
The Builder design pattern can be useful for creating complex objects with many optional parameters. It can also be used to create immutable objects, which are objects whose state cannot be changed once they have been created.

Here are some of the benefits of using the Builder design pattern:

It makes it easy to create complex objects with many optional parameters.
It can be used to create immutable objects.
It improves the readability and maintainability of code.
It makes it easier to test code.
