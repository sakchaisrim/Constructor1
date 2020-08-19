package TestCallConstructor;

class TestCallConstructor {
    public static void main(String[ ] args) {
        MyChild c = new MyChild();
    }
}
class MyGrandparent {
    MyGrandparent() {
        System.out.println("MyGrandparent() constructor");
    }
}
class MyParent extends MyGrandparent {
    MyParent() {
        this(100);
        System.out.println("MyParent() constructor");
      /* System.out.println("Parent() constructor");
      this(100); */
    }
    MyParent(int x) {
        super();
        System.out.println("MyParent(" + x + ") constructor");
    }
}
class MyChild extends MyParent {
    MyChild() {
        super();
        System.out.println("MyChild() constructor");
    }
}