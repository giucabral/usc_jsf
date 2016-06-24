package br.com.giucabral.util;






public class HibernateUtil {

    
    private static final SessionFactory sessionFactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static{
       try{
           System.out.println("Testando abrir uma SF");
           Configuration configuration = new Configuration().configure();
           ServiceRegistry serviceRegistry = new serviceRegistreBuilder().applySettings(configuration.getProperties().buildServiceRegistry);

           sessionFactory = configuration.buildSessionFactory(s);
       } catch (Exception ex) {
           System.out.println("Ocorreu um erro ao iniciar a SF. " + ex);
           throw new ExceptionInInitializerError(ex);
       }
    }
    
    public static SessionFactory getSessionFactory(){
        retur sessionFactory;
    }
    
}
