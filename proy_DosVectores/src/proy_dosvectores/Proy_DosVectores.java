
package proy_dosvectores;

import javax.swing.JOptionPane;

public class Proy_DosVectores {
    
    // comenta la lineas.

    static double [] A = new double [4];
    static double [] B = new double [8];
    static int cont1 = 0, cont2 = 0;
    static double suma = 0, promedio = 0;
    
    protected static void IngresarNodo ()
    {
    double dato = Double.parseDouble(JOptionPane.showInputDialog(null,"A[" + cont1 + "]"));
    
    A[cont1] = dato;
    cont1++;
    if (cont1 == 4)
    {
        suma = 0;
        for (int i = 0; i <= 3; i++)
        {
        suma = suma + A[i];
        }
        
        promedio = suma / 4;
        B [cont2] = promedio;
        cont1 = 0;
        cont2++;
        JOptionPane.showMessageDialog(null,"Reiniciando el vector A");
        for (int i = 0; i <= 3; i++)
        {
            A[i] = 0;
        }
    }
        MenuPrincipal();
    }
    
    protected static void MostrarNodos()
    {
        JOptionPane.showMessageDialog(null,"A = [" + A[0] + "] - [" + A[1] + "] - [" + A[2] + "] - [" + A[3] + "]"+ "\n\nB = [" + B[0] + "] - [" + B[1] + "] - [" + B[2] + "] - [" + B[3] + "] - [" + B[4] + "] - [" + B[5] + "] - "
                        + "[" + B[6] + "] - [" + B[7] + "]");
        MenuPrincipal();
    }
    
    protected static void MenuPrincipal()
    {
        String op = JOptionPane.showInputDialog(null, "====MENU PRINCIPAL====\n1.Ingresar \n2.mostrar \n3.salir\n");
        if (op.equals("1"))
        {
            IngresarNodo();
        }
        if(op.equals("2"))
        {
            MostrarNodos();
        }
        if(op.equals("3"))
        {
            System.exit(0);
        }
     
    }
    public static void main(String[] args) {
        MenuPrincipal();
    }
    
}
