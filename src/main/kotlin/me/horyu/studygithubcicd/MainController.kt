package me.horyu.studygithubcicd

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController(
    private val gitInfo: GitInfo,
) {
    @GetMapping
    fun main(model: Model): String {
        model.addAttribute("gitInfo", gitInfo)
        return "main"
    }
}