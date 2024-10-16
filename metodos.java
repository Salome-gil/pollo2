import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class metodos {
    public LinkedList<ObjPollo>llenarLista(LinkedList<ObjPollo>lista)
    {
        boolean continuar=true;
        while (continuar) {
            String Marca;
            String TipoCoccion;
            String Presas;
            double Precio;
            Scanner sc= new Scanner(System.in);
            ObjPollo o= new ObjPollo();
            JOptionPane.showMessageDialog(null, "HOLA");
            System.out.println("ingrese la marca del posho");
            o.setMarca(sc.next());
            System.out.println("ingrese el tipo de coccion del posho");
            o.setTipoCoccion(sc.next());
            System.out.println("ingrese que presas quiere del posho");
            o.setPresas(sc.next());
            System.out.println("ingrese el precio del posho");
            o.setPrecio(sc.nextDouble());
            System.out.println("Desea agregar otro posho? 1:si \n 2:no");
            int opt= sc.nextInt();
            if (opt==2) {
                continuar=false;
            }
        }
        return lista;


    }
    public void MostrarPoshos(LinkedList<ObjPollo>lista){
        for (ObjPollo po : lista) {
            System.out.println("la marca del posho es: " +po.getMarca());
            System.out.println("el tipo de coccion de su posho es: "+ po.getTipoCoccion());
            System.out.println("sus presas de su posho es: "+po.getPresas());
            System.out.println("el precio de su posho es: "+po.getPrecio());
            System.out.println("------------------------------------------------------------");
        }
    }
}
