/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu1819.framework.servlet;

import etu1819.framework.*;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author gaiden
 */

public class Utilitaire {
    public static String getURLWithContextPath(HttpServletRequest request) {
   return request.getPathInfo();
}

}
