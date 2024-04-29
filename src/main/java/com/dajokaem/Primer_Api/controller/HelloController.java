/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dajokaem.Primer_Api.controller;

import Clases.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jos56
 */
@RestController
public class HelloController {

    @GetMapping("/Spring")
    public String sayHello() {
        return "Spring boot es una herramienta para desarrollar API's con Java";
    }

    @GetMapping("/Hello")
    public String sayNada() {
        return "Hola Mundo";
    }

    @GetMapping("Hello/{nombre}")
    public String sayHello(@PathVariable String nombre) {
        return "Que pedo " + nombre;
    }

    @GetMapping("Hello/{nombre}/{edad}/{profesion}")
    public String sayHello(@PathVariable String nombre, @PathVariable String edad, @PathVariable String profesion) {
        return "Hola negro de nombre " + nombre + " Veo que ya aprietas, tienes " + edad + " y te dedicas, ademas de la prostitucion a " + profesion;
    }

    @GetMapping("/Hello2")
    public String decirHola(@RequestParam String nombre, @RequestParam String edad, @RequestParam String profesion) {
        return "Hola negro de nombre " + nombre + " Veo que ya aprietas, tienes " + edad + " y te dedicas, ademas de la prostitucion a " + profesion;
    }

    @GetMapping("/Prueba")
    public String prueba() {
        return "<html>"
                + "<header> No hay nada</header>"
                + "<body>"
                + "<h1 align='center'>Sexo"
                + "</body>"
                + "</html>";
    }

    @GetMapping("/Sumar/{nm}/{nm2}")
    public String Sumar(@PathVariable int nm, @PathVariable int nm2) {
        int res = nm + nm2;
        String msg = "" + res;
        return msg;
    }

    @GetMapping("/Peso")
    public String Peso(@RequestParam double peso) {
        if (peso < 0) {
            return "Me diste negativos";
        } else {
            if (peso < 18.5) {
                return "Peso insuficiente";
            } else {
                if (peso < 24.9) {
                    return "Peso Normal";
                } else {
                    if (peso < 29.9) {
                        return "Sobrepeso";
                    } else {
                        return "Obesidad";
                    }
                }
            }
        }
    }
    @GetMapping("/Galones")
    public String Galones(@RequestParam int nm){
        double res = 0.0;
        res = nm*3.784513;
        return "<html><head><title>Nada</title></head><body><h1> En Galones es: "+res+"</body></html>";
    }
    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cli){
        System.out.println("Cliente Creado");
        System.out.println("Nombre: "+cli.getName()+" Apellido: "+cli.getApe());
    }

}
