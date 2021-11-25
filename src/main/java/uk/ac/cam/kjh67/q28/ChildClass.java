package uk.ac.cam.kjh67.q28;

class ChildClass extends ParentClass{
    String name;

    ChildClass() {
        name = "child";
    }

    @Override
    void action() {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();

        ParentClass childAsParent = (ParentClass)child;

        childAsParent.action();

        System.out.println(childAsParent.name);
    }
}
