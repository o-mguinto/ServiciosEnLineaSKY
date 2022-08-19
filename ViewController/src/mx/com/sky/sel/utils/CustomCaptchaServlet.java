package mx.com.sky.sel.utils;


import java.awt.Color;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.captcha.Captcha;
import static nl.captcha.Captcha.NAME;
import nl.captcha.backgrounds.FlatColorBackgroundProducer;
import nl.captcha.servlet.CaptchaServletUtil;

public class CustomCaptchaServlet extends HttpServlet {

    public CustomCaptchaServlet() {
        super();
    }
    
    private static final int IMG_WIDTH = 200;
    private static final int IMG_HEIGHT = 50;
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Captcha captcha = new Captcha.Builder(IMG_WIDTH, IMG_HEIGHT)
                .addText()
            .addBackground(new FlatColorBackgroundProducer(new Color(255,255,255)))
            .gimp()
            .addNoise()
            .build();

        CaptchaServletUtil.writeImage(resp, captcha.getImage());
        req.getSession().setAttribute(NAME, captcha);
    }
}
