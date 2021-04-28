
package co.edu.unicauca.FacadeProxy.app.proxy;

import co.edu.unicauca.FacadeProxy.access.IOrderRepository;

/**
 * la interfaz representa la operacion a guardar un servicio en el sistema
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public interface IOrderService {
    
   public void  save(IOrderRepository repo);
}
