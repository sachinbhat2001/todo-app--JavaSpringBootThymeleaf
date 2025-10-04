package com.example.ToDoApp.Controller;

import com.example.ToDoApp.models.Task;
import com.example.ToDoApp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
On @RequestMapping Methods (Return Value):
While less common than the other two uses, @ModelAttribute can also be applied directly to a @RequestMapping method. In this case, the method's return value is treated as a model attribute, and the view name is derived from the request mapping.
*/
@Controller
//@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/")
    public String getTasks(Model model){
        //Model attribute is a JAVA Object, makes sure that data is available in View Layer
        List<Task> tasks=taskService.getAllTask();
        System.out.println("Tasks from DB: " + tasks);
        model.addAttribute("tasks",tasks);
        return "tasks"; //Name of the thymeleaf template that we are rendering
    }
    @PostMapping("/")
    public String createTask(@RequestParam String title){
        taskService.createTask(title);
        return "redirect:/";
    }
    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        //List<Task> tasks=taskService.getAllTask();
        taskService.deleteTask(id);
        return "tasks";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);
        return "tasks";
    }
}
