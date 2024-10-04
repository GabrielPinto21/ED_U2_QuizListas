/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.unidad2.quiz;

/**
 *
 * @author Boris Perez
 */
public class Test {

    public static void main(String[] args) {
        MyDoubleLinkedList<Estudiante> listaD = new MyDoubleLinkedList<>();
        listaD.add(new Estudiante("114", "Rafael", 5, 3.2));
        listaD.add(new Estudiante("115", "Miranda", 3, 2.7));
        listaD.add(new Estudiante("116", "Rodrigo", 4, 3.8));
        listaD.add(new Estudiante("117", "Susana", 4, 3.5));
        listaD.add(new Estudiante("118", "Rafael", 3, 4.2));

        listaD.print();
        System.out.println("------------------------------");
        /*
        114 - Rafael ::: Semestre: 5 (3.2)
        115 - Miranda ::: Semestre: 3 (2.7)
        116 - Rodrigo ::: Semestre: 4 (3.8)
        117 - Susana ::: Semestre: 4 (3.5)
        118 - Rafael ::: Semestre: 3 (4.2)
         */

        // El caso a continuación eliminará el nodo que coincida con el 
        // código 116 y el semestre 4. Los demás campos no deben tomarse
        // en cuenta.
        listaD.delete(new Estudiante("116", null, 4, 0));
        
        // El caso a continuación eliminarán 2 nodos, porque hay dos nodos
        // que coinciden con el nombre Rafael. Los demás campos no deben 
        // tomarse en cuenta.
        listaD.delete(new Estudiante(null, "Rafael", 0, 0));
        
        // Se imprimen los nodos restantes en orden inverso.
        listaD.reversePrint();
        /*
        117 - Susana ::: Semestre: 4 (3.5)
        115 - Miranda ::: Semestre: 3 (2.7)      
         */

    }
}
