package org.example.lab2_exb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateController {

    @RequestMapping("/whatDate")
    public String date(Model model) {

        // create SimpleDateFormat object
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date currentDate = new Date();  // create Date object with current date
        String dateString = sdf.format(currentDate);   // format current date to 'dd/MM/yyy'

        // Add the formatted date to the model
        model.addAttribute("currentDate", dateString);

        return "showDate";
    }
}
