package com.codewithabhishek.mainclass;


import com.codewithabhishek.bean.InfoBean;
import com.codewithabhishek.exception.NameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PublishData {


    public void publishData(InfoBean infoBean)  {
        if (infoBean.getName().isEmpty()) {
            throw new NameNotFoundException("Name value is Empty ");
        }

    }

}
