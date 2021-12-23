package mydhili.murali.MVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MVCController {
    @RequestMapping("/")
    //@ResponseBody
    public String index(){
       // return "This is Home page";//TODO: return path
        return "home";// this return home should be same as the html file name(home.html)

    }
    @RequestMapping("/dynamic")
    public String dynamic(Model model){
        int a=10;
        model.addAttribute("value",a);
        return "dynamic";
    }
    //get 2 values from user as input
    //add those 2 values  and give result
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    @RequestMapping("/result")
    public String result(Model model, HttpServletRequest req){
        int num1=Integer.parseInt(req.getParameter("num1"));
        int num2=Integer.parseInt(req.getParameter("num2"));
        int result=num1+num2;
        model.addAttribute("result",result);
        return "result";
    }
}
