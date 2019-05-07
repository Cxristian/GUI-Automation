/*
 * @(#) Login.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.utils;

import org.testng.internal.Yaml;

import java.io.InputStream;
import java.util.Map;

public class Login {

//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream("login.yaml");
    Map<String, Object> obj = yaml.load(inputStream);
    System.out.println(obj);
}
