package chandu;

public interface Drawable {
	// Define an interface named "Drawable"
	
	    void draw(); // This method must be implemented by classes that implement the Drawable interface
	}

	// Create an abstract class named "Shape" that implements the "Drawable" interface
	abstract class Shape implements Drawable {
	    // This abstract class implements the "Drawable" interface, so it must provide an implementation for the "draw" method.
	    // However, it can also declare abstract methods that its subclasses must implement.

	    // Abstract method to get the area of the shape
	    abstract double area();
	}

	// Create a concrete subclass of "Shape" named "Circle"
	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public void draw() {
	        System.out.println("Drawing a circle with radius " + radius);
	    }

	    @Override
	    double area() {
	        return Math.PI * radius * radius;
	    }
	}

	


