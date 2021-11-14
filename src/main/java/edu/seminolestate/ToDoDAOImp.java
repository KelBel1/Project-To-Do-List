package edu.seminolestate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ToDoDAOImp implements ToDoDAO{

	@Override
	public void addTask(ToDo task) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(task);
        transaction.commit();
        session.close();
	}

	@Override
	public List<ToDo> showTask() {
		List<ToDo> results = new ArrayList();
		String hql = "FROM ToDo";
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		results = query.list();
        return results;
	}

	@Override
	public void deleteTask(ToDo task) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(task);
        transaction.commit();
        session.close();
	}

}