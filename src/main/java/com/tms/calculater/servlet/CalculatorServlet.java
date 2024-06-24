package com.tms.calculater.servlet;

import com.tms.calculater.service.CalculatorService;
import com.tms.calculater.entity.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String operation = req.getParameter("operation");

        char operand = CalculatorService.getOperandOfOperation(operation);


        try {
            resp.getWriter().print(num1 + " " + operand + " " + num2 + " = " + Calculator.calculate(num1, num2, operand));
        } catch (IllegalArgumentException e) {
            resp.getWriter().print("Illegal operation.");
        }
    }

}
