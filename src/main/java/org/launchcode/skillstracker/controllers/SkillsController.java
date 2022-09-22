package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(value = "", method = {RequestMethod.GET})
    public String index() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker<h1>" +
                "<h2>We have a few skills we would like you to learn! Here is the list:<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<body>" +
                "<html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<h2>Name</h2>" +
                "<input type='text' name='name'>" +
                "<h3>My Favorite Language</h3>" +
                "<select name=\"language\" id=\"language-select\">\n" +
                "    <option value=\"\">--Please choose an option--</option>" +
                "    <option value=\"Java\">Java</option>\n" +
                "    <option value=\"JavaScript\">JavaScript</option>\n" +
                "    <option value=\"Python\">Python</option>\n" +
                "</select>" +
                "<h3>My Second Favorite Language</h3>" +
                "<select name=\"language2\" id=\"language-select2\">\n" +
                "    <option value=\"\">--Please choose an option--</option>" +
                "    <option value=\"Java\">Java</option>\n" +
                "    <option value=\"JavaScript\">JavaScript</option>\n" +
                "    <option value=\"Python\">Python</option>\n" +
                "</select>" +
                "<h3>My Third Favorite Language</h3>" +
                "<select name=\"language3\" id=\"language-select3\">\n" +
                "    <option value=\"\">--Please choose an option--</option>" +
                "    <option value=\"Java\">Java</option>\n" +
                "    <option value=\"JavaScript\">JavaScript</option>\n" +
                "    <option value=\"Python\">Python</option>\n" +
                "</select>" +
                "<h3>Click Submit to See Your List</h3>" +
                "<input type='submit' value='Submit!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping(value = "form")
    public String helloForm(@RequestParam String name, @RequestParam String language, @RequestParam String language2, @RequestParam String language3) {
        if (name == null){
            name = "Emily";
        }
        return languageList(name, language, language2, language3);
    }

    private String languageList(String name, String l, String l2, String l3){
        String list = "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>"+
                "<ol>"+"<li>"+l+"</li>" +"<li>"+l2+"</li>"+"<li>"+l3+"</li>" +
                "</body>" +
                "</html>";
        return list;
    }
}
