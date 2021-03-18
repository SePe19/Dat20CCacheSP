package mandatory.cache.controllers;

import mandatory.cache.objects.Cache;
import mandatory.cache.objects.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    Cache cache = new Cache();
    User users = new User();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String userData(@RequestParam String id) throws InterruptedException {
        if (!cache.has(id)) {
            cache.set(id, users.getDataSlow());
        }
        return cache.get(id);
    }

}
