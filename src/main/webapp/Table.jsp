<%@ taglib uri="/WEB-INF/tags.tld" prefix="m" %> 
<%@ page import="java.sql.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="com.iss.models.*" %>  

<%
    List<product> studentList = new ArrayList<>();
    Connection con = DriverManager.getConnection(
        "jdbc:sqlserver://localhost\\sqlexpress;databaseName=studentdb;integratedSecurity=true;encrypt=true;trustServerCertificate=true"
    ); 
    Statement stmt = con.createStatement(); 
    ResultSet rs = stmt.executeQuery("SELECT * FROM product"); 
    
    while (rs.next()) { 
    	product s =new product();
        s.setAttribute("pid", rs.getInt("pid")); 
        s.setAttribute("pname", rs.getString("pname")); 
        s.setAttribute("price", rs.getDouble("price"));
        s.setAttribute("barcode", rs.getInt("barcode"));
        studentList.add(s); 
    } 

    rs.close(); 
    stmt.close(); 
    con.close(); 
    
    request.setAttribute("studentList", studentList); 
%> 

New Table is:  
<m:Table array="${studentList}" />
