
/* Day4 - Java program to find the area of a triangle.

Formula : s=(a+b+c)/2
Area = sqrt(s*(s-a)(s-b)(s-c))  

*/     

package JAVA;

public class Day4 {
    public static void main(String args[]){
        int side1 = 20;
        int side2 = 30;
        int side3 = 40;
        int sum = side1+side2+side3;
        System.out.println(sum);
        int perimeter = sum/2;
        System.out.println(perimeter);
        int base = (perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
        System.out.println(base);
        

    }
    
}
