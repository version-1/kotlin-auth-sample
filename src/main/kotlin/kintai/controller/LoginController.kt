package kintai.controller

/**
 * Created by version1 on 2017/02/11.
 */

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import kintai.service.UserService


@Controller
class LoginController @Autowired constructor(private val userService: UserService) {

    @RequestMapping("/")
    fun root(): ModelAndView{
        return ModelAndView("/index")
    }

    @RequestMapping("/index")
    fun index(): ModelAndView{
        return ModelAndView("/index")
    }

    @RequestMapping("/login/success")
    fun users(): ModelAndView = ModelAndView("/login/success")
}