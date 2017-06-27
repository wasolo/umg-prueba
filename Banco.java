package org.umg.curso.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente c;
        c = new Cliente();
        c.setNombre("Diego");
        c.setEdad(32);
        c.setSalario(1111);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nombre:");
        c.setNombre( reader.readLine());
        System.out.println("Su edad:");
        c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su Salario:");
        c.setSalario(Integer.parseInt(reader.readLine()));

        System.out.println("Estimado Cliente: "+c.getNombre()+" su salario será de "+c.getSalario() );
    }
}
