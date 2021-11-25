package uk.ac.cam.kjh67.q37;

public class B extends A{
    // Problem: no default constructor available in A

    // Create a constructor for B which passes an argument to A's constructor
    // If this new constructor takes an argument, we cause a problem for C
    B(int arg) {
        super(arg);
    }

    // This would have required no changes to C:
    // B() { super(1); }
    // Or similar for any int in the place of 1
}
