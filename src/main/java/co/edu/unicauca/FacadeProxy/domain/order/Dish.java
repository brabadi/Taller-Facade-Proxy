/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.FacadeProxy.domain.order;

/**
 * representa un plato
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public class Dish {

    /**
     * identificador del plato
     */
    private int id;
    /**
     * nombre del plato
     */
    private String name;
    /**
     * costo del plato
     */
    private int price;

    /**
     * constructor por defecto
     */
    public Dish() {
    }

    /**
     * constructor parametrizado
     *
     * @param id identificador del plato
     * @param name nombre del plato
     * @param price precio o costo del plato
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
