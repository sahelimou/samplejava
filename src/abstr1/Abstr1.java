/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstr1;

/**
 *
 * @author User
 */
abstract class polygon{
    abstract void no_of_sides();
}
class triangle extends polygon{
    void no_of_sides()
    {
        System.out.println("triangle has 3 sides");
    }
}
class hexagon extends polygon{
   void no_of_sides()
    {
        System.out.println("hexagon has 6 sides");
    } 
}
class pentagon extends polygon{
    void no_of_sides()
    {
        System.out.println("pentagon has 5 sides");
    } 
}
class octagon extends polygon{
    void no_of_sides()
    {
        System.out.println("octagon has 8 sides");
    } 
}
        
public class Abstr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
octagon o=new octagon();
o.no_of_sides();
pentagon p=new pentagon();
p.no_of_sides();
hexagon h1=new hexagon();
h1.no_of_sides();
triangle t1=new triangle();
t1.no_of_sides();
// TODO code application logic here
    }
    
}
