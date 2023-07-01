package com.vaishu.java_program;

class Pen{
   String color;
   String type;

  /* public void write(){
     System.out.println("Writting Something !!");
   }*/
   public void print(){
       System.out.println("Costructor created ");
     System.out.println(this.color);
     System.out.println(this.type);
   }
   Pen(Pen p2 ){
       this.color=p2.color;
       this.type=p2.type;
   }
   Pen(){}

}

public class OOPS{

  public static void main(String []args){

    Pen p1 = new Pen();

     p1.color="Blue";
     p1.type="Ball point pen";

     Pen p2=new Pen(p1);
     p2.print();

  }
}