/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.unidad2.quiz;

import java.util.Objects;

/**
 *
 * @author Boris Perez
 */
public class Estudiante {

    private String codigo, nombre;
    private int semestre;
    private double promedio;

    public Estudiante(String codigo, String nombre, int semestre, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return getCodigo() + " - " + getNombre() + " ::: Semestre: " + getSemestre() + " (" + getPromedio() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales=false;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Estudiante other = (Estudiante) obj;
        if (other.getCodigo() != null) {
            
            if (this.codigo == other.getCodigo()) {
                iguales = true;
            }else
                return false;
        }
        if (other.getNombre() != null) {
            if (this.nombre == other.getNombre()) {
                iguales = true;
            }else
                return false;
        }
        if (other.getSemestre() > 0) {
            if (this.semestre == other.getSemestre()) {
                iguales = true;
            }else
                return false;
        }
        if (other.getPromedio() > 0) {
            if (this.promedio == other.getPromedio()) {
                iguales = true;
            }else
                return false;
        }

        return iguales;
    }

}
