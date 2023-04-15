# Java Demo Abstract Class

Abstract classes are used in Java to create classes that cannot be instantiated, but instead serve as a blueprint or template for other classes to inherit from. Here are some common use cases of abstract classes in Java:

1. Encapsulating common functionality: Abstract classes can encapsulate common functionality or behavior that can be inherited by its concrete subclasses. This helps to avoid code duplication and makes the code more maintainable.

2. Defining a template method: Abstract classes can define a template method that provides a skeleton for the behavior of its concrete subclasses. The template method can define the steps that need to be followed, and the concrete subclasses can implement the specific details of each step.

3. Providing a common interface: Abstract classes can define a common interface that is shared by its concrete subclasses. This helps to ensure that all the subclasses have a consistent set of methods, making it easier to work with them in a polymorphic way.

[![Vaibhav Mojidra - 1.jpeg](https://raw.githubusercontent.com/VaibhavMojidra/Java---Demo-Abstract-Class/master/output/1.jpeg "Vaibhav Mojidra")](https://vaibhavmojidra.github.io/site/)

In this example, Shape is an abstract class that defines a common interface for its concrete subclasses Circle and Rectangle. It also provides a method move() that can be used by all its subclasses. The draw() method is abstract, which means that it must be implemented by the concrete subclasses. The Circle and Rectangle classes inherit from Shape and implement their own versions of the draw() method. This allows us to create different shapes that can be drawn in different ways, but still share some common functionality provided by the Shape abstract class.