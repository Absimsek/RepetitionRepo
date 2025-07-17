package AUG2025.AUG09.Interface;

public interface Interface01 {
    // interfaces also inside inheritance structure
    // an interface must have %100 abstract methods
    // so difference of a abstract class and interface is
    // class can have or cannot have abstract but interface have %100 abstract
    // normal inheritance uses extends
    // but to make an interface parent use implements keyword
    // normal inheritance doesn't allow multiple inheritance so each class can have 1 parent
    // but if we use interfaces as parents there can be more than one so that multiple inheritance will be achieved
    // all methods in interfaces are abstract,public, and non-static
    //multiple interfaces can have same method, overriding it will override all interfaces
    // all variables in interfaces are final, should be given data when declaring.
    // all variables also public and static because object cannot be created so datas will be reached by static
    // even though it is %100 abstract, if you want you can add concrete method with static keyword
    // or default access modifier
    // when concrete method created by default keyword to access it we should use child class object
    // since it has access to parents methods.
/*
 Child           Parent              keyword
 class           class        ==>    extends
 interface       interface    ==>    extends
 class           interface    ==>    implements
 interface       class        ==>    no such thing
 */
}
