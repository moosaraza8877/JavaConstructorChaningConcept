/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorchainingconcept;

/**
 *
 * @author Moosa Raza
 */
public class ConstructorChainingConcept {
    
    public ConstructorChainingConcept(){
        
        System.out.println("Constructor no 1 is invoked");
    }
    
    /*public ConstructorChainingConcept(int a){
        System.out.println("Constructor no 1(PAra) is invoked.");
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ConstructorChainingConcept ccc = new ConstructorChainingConcept();
        A a = new A();*/
        new B();
        //B b1 = new B(1);
       // ConstructorChainingConcept ccc1 = new ConstructorChainingConcept(2);
        
    }
   
}
 class A extends ConstructorChainingConcept{
    public A(){
        this("Constructor no 2 is invoked");
        System.out.println("Constructor no 3 is invoked");
    }
    public A(String a){
        
        System.out.println(a);
    }
}
class B extends A{
    
    public B(){
        System.out.println("Constructor no 4 is invoked");
    }
}
