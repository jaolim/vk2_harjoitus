package com.example.vk2_harjoitus.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.vk2_harjoitus.domain.Friend;

@Controller
public class FriendController {

    public static List<Friend> friends = new ArrayList<>();

    @GetMapping("/hello3")
    public String showFriends(Model model) {
        model.addAttribute("friends", friends);
        return "friends";
    }

    @GetMapping("/add")
    public String addFriend(Model model) {
        model.addAttribute("friend", new Friend());
        return "add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Friend friend){
        friends.add(friend);
        return "redirect:hello3";
    }

}