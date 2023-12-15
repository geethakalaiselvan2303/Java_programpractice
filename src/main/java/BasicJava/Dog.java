package BasicJava;

 class Dog {
    String name;   // Defaults to null
    String breed;  // Defaults to null
    int cost;      // Defaults to 0
}

 @Test
 class Demo {
		Dog d = new Dog();
        System.out.println(d.name);   // Prints null
        System.out.println(d.breed);  // Prints null
        System.out.println(d.cost);   // Prints 0
    }
}

