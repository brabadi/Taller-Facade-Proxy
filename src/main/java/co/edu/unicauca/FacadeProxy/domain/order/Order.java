/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.FacadeProxy.domain.order;

import co.edu.unicauca.FacadeProxy.domain.order.Dish;
import co.edu.unicauca.FacadeProxy.domain.order.Customer;
import co.edu.unicauca.FacadeProxy.domain.order.Item;
import co.edu.unicauca.FacadeProxy.domain.order.State;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braia
 */
public class Order {

    /**
     * costo de envio
     */
    private int despatch;
    /**
     * cliente
     */
    private Customer customer;
    /**
     * fecha
     */
    private LocalDate date;
    /**
     * estado de la orden
     */
    private State state;
    /**
     * lista de items "platos"
     */
    private List<Item> details;

    /**
     * constructor por defecto
     */
    public Order() {
        details = new ArrayList<Item>();
        this.despatch = 1500;
    }

    /**
     * constructor parametrizado
     *
     * @param customer cliente
     */
    public Order(Customer customer) {
        details = new ArrayList<Item>();
        this.customer = customer;
        this.despatch = 1500;
        this.state = State.NEW;
    }

    /**
     * agrega un nuevo item a la orden
     *
     * @param dish plato.
     * @param amount cantidad de platos
     */
    public void addDish(Dish dish, int amount) {
        Item auxiliar = new Item(dish, amount);
        details.add(auxiliar);
    }

    /**
     * AUN NO IMPLEMENTADO calcula el costo total de la orden
     *
     * @return total de la orden.
     */
    public int calculateTotal() {
        int costo = 0;
        int total = 0;
        for (Item I : this.details) {
            costo = I.getDish().getPrice() * I.getAmount();
            total += costo;
        }
        return total + this.despatch;
    }

    //SET AND GET
    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(List<Item> list) {
        this.details = list;
    }
}
