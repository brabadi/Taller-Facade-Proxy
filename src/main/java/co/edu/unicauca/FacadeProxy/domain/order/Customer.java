/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.FacadeProxy.domain.order;
/**
 * representa un cliente
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public class Customer {
    /**
     * identificador del cliente
     */
    private int id;
    /**
     * nombre del cliente
     */
    private String name;
    /**
     * direccion del cliente
     */
    private String address;
    /**
     * telefono mobile del cliente, numero
     */
    private String mobile;
    /**
     * ciudad en la que habita
     */
    private String city;
    /**
     * constructor por defecto
     */
    public Customer() {
    }

    /**
     * constructor parametrizado
     * @param id identificacion del cliente
     * @param name nombre del cliente
     * @param address direccion del cliente
     * @param mobile numero telefonico del cliente
     * @param city ciudad 
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }
    
    //SET AND GET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
