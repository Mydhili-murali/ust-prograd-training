package ABC.Bank.ABCBank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MVCController {
    ArrayList<String> details1 = new ArrayList<>();

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {

        return "login";

    }

    @RequestMapping("/register")
    public String register(Model model, HttpServletRequest req) {
        details1.add(req.getParameter("name"));
        details1.add(req.getParameter("username"));
        details1.add(req.getParameter("password"));
        details1.add(req.getParameter("phNo"));
        details1.add(req.getParameter("branch"));
        details1.add(req.getParameter("accountNo"));
        //System.out.println("Registered Successfully");
        return "register";
    }

    @RequestMapping("/details")
    public String details(Model model, HttpServletRequest req) {
        Map<String, ArrayList<String>> userDetails = new HashMap<>();
        ArrayList<String> details1 = new ArrayList<>(List.of("Mydhili Murali", "mydhili123@mydhili", "9876452341", "Vallachira", "1234534562"));
        ArrayList<String> details2 = new ArrayList<>(List.of("Nimin Murali", "nimin123@nimin", "9845231234", "Kunnamangalam", "3212345234"));
        ArrayList<String> detailsList = new ArrayList<>();
        userDetails.put("mydhilimurali", details1);
        userDetails.put("niminmurali", details2);

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (userDetails.containsKey(username)) {
            for (Map.Entry<String, ArrayList<String>> value : userDetails.entrySet()) {
                detailsList = value.getValue();
                if (detailsList.contains(password)) {
                    model.addAttribute("message", "Login successful!!!!!!!");
                    model.addAttribute("customerName", detailsList.get(0));
                    model.addAttribute("phoneNumber", detailsList.get(2));
                    model.addAttribute("branchName", detailsList.get(3));
                    model.addAttribute("accountNumber", detailsList.get(4));

                }
                else{
                    model.addAttribute("errorMessage","Invalid user!!!!!!");
                }
            }
        }

        return "details";
    }
}
