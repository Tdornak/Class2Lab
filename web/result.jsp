<%-- 
    Document   : result
    Created on : Aug 27, 2014, 4:55:19 PM
    Author     : Tim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>The result page</h1>
        <% 
            Object obj = request.getAttribute("name");
            if(obj == null) {
                out.println("Sorry something went wrong");
            } else {
                out.println(obj.toString());
            }
        %>
    </body>
</html>
