package med.voll.api.controller;

import med.voll.api.doctor.DoctorRecordData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @PostMapping
    public void register(@RequestBody DoctorRecordData data) {
        System.out.println(data);
    }
}
