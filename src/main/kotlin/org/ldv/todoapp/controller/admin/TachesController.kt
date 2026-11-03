package org.ldv.todoapp.controller
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
@Controller
class TachesController {
    @GetMapping("/admin/taches")
    fun TachesController(): String {
        return "admin/taches"
    }
}