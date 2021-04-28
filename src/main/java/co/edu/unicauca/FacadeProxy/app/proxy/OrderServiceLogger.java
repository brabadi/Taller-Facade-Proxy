package co.edu.unicauca.FacadeProxy.app.proxy;

import co.edu.unicauca.FacadeProxy.access.IOrderRepository;
import co.edu.unicauca.FacadeProxy.domain.order.OrderFacade;
import org.slf4j.LoggerFactory;

/**
 * slf4j.LoggerFactory;
 *
 * Representa el logger para cada vez que se cree un nuevo pedido en el sistema
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public class OrderServiceLogger implements IOrderService {

    private OrderFacade orderFacade;

    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    /**
     * Guarda una orden en el repositorio
     *
     * @param repo
     */
    @Override
    public void save(IOrderRepository repo) {
        org.slf4j.Logger log = LoggerFactory.getLogger(OrderServiceLogger.class);
        repo.createOrder(orderFacade.getOrder());
        String message = "pedido guardado en la base de datos";
        log.info(message);
    }
}
