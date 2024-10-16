import java.util.LinkedList;

public class main {
public static void main(String[] args) {
    LinkedList<ObjPollo>lista= new LinkedList<>();
    metodos m= new metodos();
    lista=m.llenarLista(lista);
    m.MostrarPoshos(lista);
}
    
}