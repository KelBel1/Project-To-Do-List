package edu.seminolestate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class TaskController extends HttpServlet {

        ToDo task = new ToDo();
        ToDoDAOImp tododaoimp = new ToDoDAOImp();
        ToDoDAO tdao;
       
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("addTask")!=null){
            String id = request.getParameter("ttaskID");
            String taskDesc = request.getParameter("task");
            int ttaskID = Integer.parseInt(id);
            task.settaskID(ttaskID);
            task.setTask(taskDesc);
            tododaoimp.addTask(task);
            RequestDispatcher rd = request.getRequestDispatcher("ToDoAdd.jsp");
            rd.forward(request, response);
        }
          
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         if(request.getParameter("showTask")!=null){
            List<ToDo> results = new ArrayList();
            results = tododaoimp.showTask();
            request.setAttribute("results", results);
            RequestDispatcher rd = request.getRequestDispatcher("ToDoShow.jsp");
            rd.forward(request, response);
        }
          
         if(request.getParameter("deleteEmployee")!=null){
             int id2 = Integer.parseInt(request.getParameter("id"));
             task.settaskID(id2);
             tododaoimp.deleteTask(task);
              RequestDispatcher rd = request.getRequestDispatcher("ToDoAdd.jsp");
            rd.forward(request, response);
         }
         
      
      
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
