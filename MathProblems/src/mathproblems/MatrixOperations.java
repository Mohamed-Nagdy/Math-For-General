/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproblems;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author moham
 */
public class MatrixOperations {



    
    int colOfMatrixA, rowOfMatrixA;
    int colOfMatrixB, rowOfMatrixB;
    int matrixA[][];
    int matrixB[][];
    int matrixResult[][];

    public MatrixOperations(int rowOfMatrixA, int colOfMatrixA, int rowOfMatrixB, int colOfMatrixB) {
        this.colOfMatrixA = colOfMatrixA;
        this.rowOfMatrixA = rowOfMatrixA;
        this.colOfMatrixB = colOfMatrixB;
        this.rowOfMatrixB = rowOfMatrixB;
        
        this.matrixA = new int[rowOfMatrixA][colOfMatrixA];
        this.matrixB = new int[rowOfMatrixB][colOfMatrixB];
        this.matrixResult = new int [rowOfMatrixA][colOfMatrixB];
       // JOptionPane.showMessageDialog(null, "Wrong Input", "Error", JOptionPane.WARNING_MESSAGE);
    }
    
    void ReadTables(JTable table1, JTable table2){
        
        for(int i = 0 ; i < rowOfMatrixA ; i++)
        {
            for(int j = 0 ; j < colOfMatrixA ; j++)
            {
                if(table2.getValueAt(i, j) == null)
                    continue;
                else
                    matrixA[i][j] = Integer.parseInt(table1.getValueAt(i, j).toString());
            }
        }
        
        for(int m = 0 ; m < rowOfMatrixB ; m++)
        {
            for(int n = 0 ; n < colOfMatrixB ; n++)
            {
                if(table2.getValueAt(m, n) == null)
                    continue;
                else
                    matrixB[m][n] = Integer.parseInt(table2.getValueAt(m, n).toString());
            }
        }
    }
    
    void addMethod()
    {
        for(int i = 0 ; i < rowOfMatrixA ; i++)
        {
            for(int j = 0 ; j < colOfMatrixA ; j++)
            {
                matrixResult[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }
    
    void subMethod()
    {
        for(int i = 0 ; i < this.rowOfMatrixA ; i++)
        {
            for(int j = 0 ; j < this.colOfMatrixA ; j++)
            {
                this.matrixResult[i][j] = this.matrixA[i][j] - this.matrixB[i][j];
            }
        }
    }

    void elementMultiplyMethod()
    {
        for(int i = 0 ; i < rowOfMatrixA ; i++)
        {
            for(int j = 0 ; j < colOfMatrixA ; j++)
            {
                matrixResult[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }
    }

    void devideMethod()
    {
        for(int i = 0 ; i < rowOfMatrixA ; i++)
        {
            for(int j = 0 ; j < colOfMatrixA ; j++)
            {
                try{
                matrixResult[i][j] = matrixA[i][j] / matrixB[i][j];
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Can not devide by zero", "Erorr Detected", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
    
    void WriteToTable(JTable table)
    {
        for(int i = 0 ; i < rowOfMatrixA ; i++)
        {
            for(int j = 0 ; j < colOfMatrixB ; j++)
            {
                table.setValueAt(matrixResult[i][j], i, j);
            }
        }
    }
    
    
}
