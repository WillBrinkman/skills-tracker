package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
public String frontPage(){
    return  "<h1>Skills Tracker</h1>"+
            "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
            "<ol>"+
            "<li>Java</li>"+
            "<li>JavaScript</li>"+
            "<li>Python</li>"+
            "</ol>";
}
    @PostMapping("form")
    @ResponseBody
    public String showFormInput(@RequestParam String name, @RequestParam String language1,@RequestParam String language2, @RequestParam String language3) {
        return  "<h1>"+name+"<h1>"+
                "<h2>"+
                "<ol>"+
                "<li>"+ language1 +"</li>"+
                "<li>"+ language2 +"</li>"+
                "<li>"+ language3 +"</li>"+
                "</ol>" +
                "<h2>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = 'form'>" +
                "<p>Name: </p>"+
                "<input type = 'text' name='name'>" + "<br>"+
                "<p>My favorite language </p>"+
                "<select name='language1' id='language select'>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "<option value='JavaScript'> JavaScript</option>" +
                "</select>"+
                "<p>My second favorite language </p>"+
                "<select name='language2' id='language select'>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "<option value='JavaScript'> JavaScript</option>" +
                "</select>"+
                "<p>My third favorite language </p>"+
                "<select name='language3' id='language select'>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "<option value='JavaScript'> JavaScript</option>" +
                "</select>"+ "<br>"+
                "<input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    
}
