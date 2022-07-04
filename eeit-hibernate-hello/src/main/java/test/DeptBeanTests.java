package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import model.DeptBean;

public class DeptBeanTests {
	public static void main(String[] args) {
		// 主態設定檔
        StandardServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder().configure().build();
        // 若主態檔不叫做hibernate.cfg.xml或有多個主態檔，configure(這裡要多寫)
        SessionFactory factory = new MetadataSources(
        		serviceRegistry).buildMetadata().buildSessionFactory();
	    
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        DeptBean insert = new DeptBean();
        insert.setDeptid(100);
        insert.setDeptname("test");
        session.save(insert);
        
        transaction.commit();
        session.close();
        factory.close();
        
	}
}
