package poo.u4.e11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PooU4E11 {
    static List<Cliente> clientes= new ArrayList<>();
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        ingresarClientes();
        boolean respuesta=buscarCliente();
        System.out.println(respuesta);
    }
    static void ingresarClientes(){
        int id;
        String nombre;
        Cliente aux;
        for (int i = 0; i < 2; i++) {
            System.out.println("Cliente "+(i+1));
            System.out.print("ID: ");
            id=entrada.nextInt();
            entrada.nextLine();
            System.out.print("Nombre: ");
            nombre=entrada.nextLine();
            aux=new Cliente();
            aux.setId(id);
            aux.setNombre(nombre);
            clientes.add(aux);
        }
    }
    static boolean buscarCliente(){
        System.out.print("Ingrese nombre de cliente: ");
        String nombre=entrada.nextLine();
        Iterator i=clientes.iterator();
        boolean respuesta=false;
        while(i.hasNext()){
            Cliente tmp=(Cliente) i.next();
            String dato=tmp.getNombre();
            if(dato.equals(nombre)){
            respuesta=true;    
            break;
            }
        }
        return respuesta;
    }
}
