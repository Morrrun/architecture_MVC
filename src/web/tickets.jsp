<%@ page import="com.alexsandrov.architecture_mvc.service.TicketService" %>
<%@ page import="com.alexsandrov.architecture_mvc.dto.TicketDto" %><%--
  Created by IntelliJ IDEA.
  User: mifon
  Date: 29.04.2023
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>Купленные билеты:</h1>
        <ul>
        <%
            Long flightId = Long.valueOf(request.getParameter("flightId"));
            var tickets = TicketService.getInstance().findAllByFlightId(flightId);

            for(TicketDto ticket : tickets) {
                out.write(String.format("<li>%s</li>", ticket.getSeatNo()));
            }
        %>
        </ul>
</body>
</html>
