// Package name
package myapp.core;

public class Test {

    public static void main(String [] args) {

        System.out.println("Hello world!");

        String[] todos = new String [4];
        todos [0] = "learn Java";
        todos [1] = "go jogging";
        todos [2] = "go cycling";
        
        System.out.printf("Index: %d: value = %s\n", 0, todos [0]);
        System.out.printf("Index: %d: value = %s\n", 0, todos [1]);
        System.out.printf("Index: %d: value = %s\n", 0, todos [2]);
        System.out.printf("Index: %d: value = %s\n", 0, todos [3]);

        // every array has a property called length
        System.out.printf("Size of array %d\n", todos.length);
        
        
    }    
   
}
    


