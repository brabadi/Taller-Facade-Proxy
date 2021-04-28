package co.edu.unicauca.FacadeProxy.access;

import co.edu.unicauca.FacadeProxy.domain.order.Order;
import java.util.ArrayList;

/**
 * la interfaz representa la operacion a realizar contra un registro de ordenes
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */

public interface IOrderRepository {

    public void createOrder(Order order);

    public ArrayList<Order> GetAll();
}
