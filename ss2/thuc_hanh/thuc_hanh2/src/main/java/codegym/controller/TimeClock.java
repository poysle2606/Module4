package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeClock {

    @GetMapping("/time-clock")
    public String getTimeByTime(Model model, @RequestParam(name="city", required = false, defaultValue = "Asian/Ho_Chi_Minh")String city){
        Date date = new Date();
        TimeZone local = TimeZone.getDefault();
        TimeZone timeZone = TimeZone.getTimeZone(city);

        long locale_time = date.getTime() + (timeZone.getRawOffset() - local.getRawOffset());
        date.setTime(locale_time);

        model.addAttribute("city",city);
        model.addAttribute("date",date);
        return "index";
    }
}
