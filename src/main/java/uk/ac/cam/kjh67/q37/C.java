package uk.ac.cam.kjh67.q37;

public class C extends B{
    // Problem: no default constructor available in B
    // So declare a constructor for C which can pass an argument to B's constructor
    C(int arg) {
        super(arg);
    }
}
