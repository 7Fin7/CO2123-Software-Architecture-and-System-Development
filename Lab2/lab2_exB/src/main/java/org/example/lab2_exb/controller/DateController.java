package org.example.lab2_exb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateController {

    // This annotation maps the HTTP request to the "/whatDate" URL to this method
    @RequestMapping("/whatDate")
    public String date(Model model) {

        // Create SimpleDateFormat object
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date currentDate = new Date();  // Create Date object with current date
        String dateString = sdf.format(currentDate);   // Format current date to 'dd/MM/yyy'

        // Add the formatted date to the model
        model.addAttribute("currentDate", dateString);

        // Returns the name of the view to be rendered (in this case, "showDate")
        return "showDate";
    }
}
