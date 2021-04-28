package co.edu.unicauca.FacadeProxy.access;

import co.edu.unicauca.FacadeProxy.domain.order.Order;
import java.util.ArrayList;

/**
 * Representa una lista donde se almacenan las ordenes
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */

public class OrderRepositoryList implements IOrderRepository {

    ArrayList<Order> ordenes;

    public OrderRepositoryList() {
        ordenes = new ArrayList<Order>();
    }

    @Override
    public ArrayList<Order> GetAll() {
        return ordenes;
    }

    @Override
    public void createOrder(Order order) {
        ordenes.add(order);
    }
}
