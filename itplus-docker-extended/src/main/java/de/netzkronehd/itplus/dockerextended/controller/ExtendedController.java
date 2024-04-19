package de.netzkronehd.itplus.dockerextended.controller;


import de.netzkronehd.itplus.dockerextended.model.ExtendedModel;
import de.netzkronehd.itplus.dockerextended.service.ExtendedService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("extended")
@AllArgsConstructor(onConstructor_ = {@Autowired})
@Slf4j
public class ExtendedController {

    private final ExtendedService extendedService;

    @GetMapping
    public ResponseEntity<List<ExtendedModel>> getModels() {
        return ResponseEntity.ok(this.extendedService.getModels());
    }

    @PostMapping
    public ResponseEntity<ExtendedModel> createModel(@RequestParam String name, @RequestParam String description) {
        return ResponseEntity.ok(this.extendedService.createModel(name, description));
    }

}
