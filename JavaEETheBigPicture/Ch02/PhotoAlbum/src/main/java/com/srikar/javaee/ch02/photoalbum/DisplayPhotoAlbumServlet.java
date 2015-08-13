package com.srikar.javaee.ch02.photoalbum;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.IOException;

/**
 *
 * @author vedantas
 */
public class DisplayPhotoAlbumServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String indexString =  request.getParameter("photo");
        int index = new Integer(indexString.trim());
        response.setContentType("image/jpeg");
        try(OutputStream out = response.getOutputStream()) {
            PhotoAlbum pa = PhotoAlbum.getPhotoAlbum(request.getServletContext());
            byte[] bytes = pa.getPhotoData(index);
            out.write(bytes);
        }
    }
    
}
