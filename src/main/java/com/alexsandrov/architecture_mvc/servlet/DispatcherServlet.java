package com.alexsandrov.architecture_mvc.servlet;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * DispatcherServlet - Анализирует и перенаправляет request на соответствующи Servlet.
 *
 * Он имеет 3 метода для перенаправления запросов:
 *      1.
 *      .forward("/<addressResource>") - перенаправляет запрос на Servlet по адресу ресурса.
 *      Вносить какие-либо изменения в response не получится т. к. Servlet отправит
 *      его сразу серверу
 *      2.
 *      .include("/<addressResource>") - перенаправляет запрос на Servlet по адресу ресурса.
 *      Появляется возможность вносить изменения в response Servlet отправит
 *      его сразу обратно DispatcherServlet, но так же необходимо
 *      устанавливать заново Headers. Для записи доп. информации в Servlet на который
 *      имели перенаправление, выходной поток не должен быть закрыт
 *      3.
 *      .sendRedirect("/<addressResource>") - относится только к response. Помещает в заголовок
 *      адрес ресурса перенаправления и возвращает response с Cod Status : 302 (Redirect)
 */
@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //.forward("/<addressResource>")
//        var requestDispatcher = req.getRequestDispatcher("/flights");
//        requestDispatcher.forward(req, resp);

        //.include("/<addressResource>")
//        var requestDispatcher2 = req.getRequestDispatcher("/flights");
//        requestDispatcher2.include(req, resp);
//
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
//        var writer = resp.getWriter();
//        writer.write("Hello 2");

        //.sendRedirect("/<addressResource>")
        resp.sendRedirect("/flights");


    }
}
