package co.edu.unicauca.FacadeProxy.app.proxy;

import co.edu.unicauca.FacadeProxy.access.Factory;
import co.edu.unicauca.FacadeProxy.access.IOrderRepository;
import java.lang.System.Logger;
import org.slf4j.LoggerFactory;

/**
 * representa un cliente Proxy
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public class ProxyClient {

    private IOrderService orderService;
    /**
     * Constructor Parametrizado
     *
     * @param orderService
     */
    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }
    /**
     * Devulve una instacia del repositorio
     */
    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        this.orderService.save(repo);
    }
}
