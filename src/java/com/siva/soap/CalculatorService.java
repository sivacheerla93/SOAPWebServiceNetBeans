/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siva.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Siva Cheerla
 */
@WebService(serviceName = "CalculatorService")
@Stateless()
public class CalculatorService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Addition")
    public int Addition(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1 + num2;
    }
}
