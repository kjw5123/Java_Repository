package hello.hellospring.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataController {

    private List<String> dataList = new ArrayList<>();

    @PostMapping("/data")
    public ResponseEntity<String> postData(@RequestBody String data) {
        dataList.add(data);
        return ResponseEntity.ok("Data received and saved: " + data);
    }

    @GetMapping("/data")
    public ResponseEntity<List<String>> getData() {
        return ResponseEntity.ok(dataList);
    }

    public static void main(String[] args) {
        SpringApplication.run(DataController.class, args);
    }
}
