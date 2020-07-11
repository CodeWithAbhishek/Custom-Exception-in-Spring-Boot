package com.codewithabhishek.mainclass;


import com.codewithabhishek.exception.CmdStatus;
import com.codewithabhishek.bean.InfoBean;
import com.codewithabhishek.exception.NameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.UUID;

@Controller
public class MainController {


    @Autowired
    private PublishData publishData;

    @PostMapping(value = "/post-data")
    public ResponseEntity<?> postdata(@RequestBody InfoBean bean) {
        CmdStatus cmd = new CmdStatus();
        try {
            publishData.publishData(bean);
        } catch (NameNotFoundException e) {
            cmd.setType(HttpStatus.BAD_REQUEST.toString());
            cmd.setCode(UUID.randomUUID());
            cmd.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(cmd);
        }
        return ResponseEntity.ok("Information recorded "+ " " +bean.toString());
    }


}
