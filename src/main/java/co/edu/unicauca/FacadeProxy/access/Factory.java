package co.edu.unicauca.FacadeProxy.access;

/**
 * fabrica de repositorios
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public IOrderRepository getRepository(String tipo) {
        IOrderRepository repositorio = null;
        if (tipo.equals("default")) {
            repositorio = new OrderRepositoryList();
        }
        return repositorio;
    }
}
