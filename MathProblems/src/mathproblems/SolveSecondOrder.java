/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproblems;

/**
 *
 * @author moham
 */
public class SolveSecondOrder {
    
    public String solve(int a, int b, int c)
    {
        String result;
        float x1, x2;
        
        if (a == 0)
        {
            result = "The Equation is First Order And X = " + (c/b);
        }
        else{
            float delta = (float) (Math.pow(b, 2) - 4 * b * c);
            if (delta > 0)
            {
                x1 = (float) ((-b + Math.sqrt(delta))/2 * a);
                x2 = (float) ((-b - Math.sqrt(delta))/2 * a);
                result = "X1 is :" + x1 + "X2 is : " + x2;
            }
            else if (delta == 0)
            {
                x1 = -b / 2 * a;
                x2 = -b / 2 * a;
                result = "X1 is :" + x1 + "X2 is : " + x2; 
            }
            else 
            {
                result = "No Solution";
                      
            }
        }
        
        return result;
    }
    
}
