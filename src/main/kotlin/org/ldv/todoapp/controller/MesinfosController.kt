package org.ldv.todoapp.controller
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
@Controller
class MesinfosController {
    @GetMapping("/mes-infos")
    fun MesinfosController(): String {
        return "mes-infos"
    }
}