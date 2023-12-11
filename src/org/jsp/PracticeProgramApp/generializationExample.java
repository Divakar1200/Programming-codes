package org.jsp.PracticeProgramApp;

	// Superclass (Generalized)
	class Animal {
	    String name;
	    
	    public Animal(String name) {
	        this.name = name;
	    }
	    
	    public void speak() {
	        System.out.println(name + " makes a sound.");
	    }
	}

	// Subclass (Specialized)
	class Dog extends Animal {
	    public Dog(String name) {
	        super(name);
	    }
	    
	    @Override
	    public void speak() {
	        System.out.println(name + " barks.");
	    }
	}

	public class generializationExample {
	    public static void main(String[] args) {
	        Animal Animal = new Animal("Animals");
	        Animal Dog = new Dog("doggy");

	        Animal.speak(); // Output: Generic Animal makes a sound.
	        Dog.speak();    // Output: Buddy barks.
	    }
	}

