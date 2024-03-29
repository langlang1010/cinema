package cn.smileyan.movie.controller;

import com.github.cage.Cage;
import com.github.cage.GCage;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author smileyan
 */
@Controller
@CrossOrigin
public class CageCaptchaController {
    private static final Cage cage = new GCage();

    /**
     * 获得验证码
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/captcha")
    private void cageCaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // get session
        HttpSession session = request.getSession();
        setResponseHeaders(response);
        // get token
        String token = cage.getTokenGenerator().next().substring(0,4);
        // 设置session
        session.setAttribute("cage_token",token);
        // 15分钟内有效
        session.setMaxInactiveInterval(60*15);
        cage.draw(token, response.getOutputStream());
    }

    @RequestMapping("/login")
    @ResponseBody
    private String login(String code, HttpServletRequest request){
        HttpSession session = request.getSession();
        String str = session.getAttribute("cage_token").toString().trim();
        System.out.println("str=="+str);
        // 不区分大小写
        if(str.equalsIgnoreCase(code.trim())) {
            return "SUCCESS";
        }
        return "FAILURE";
    }

    /**
     * Helper method, disables HTTP caching.
     *
     * @param resp
     *            response object to be modified
     */
    protected void setResponseHeaders(HttpServletResponse resp) {
        resp.setContentType("image/" + cage.getFormat());
        resp.setHeader("Cache-Control", "no-cache, no-store");
        resp.setHeader("Pragma", "no-cache");
        long time = System.currentTimeMillis();
        resp.setDateHeader("Last-Modified", time);
        resp.setDateHeader("Date", time);
        resp.setDateHeader("Expires", time);
    }

}
