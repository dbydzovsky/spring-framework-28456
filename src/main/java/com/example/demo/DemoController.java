/*
 * *************************************************************************
 * * Yaypay CONFIDENTIAL   2023
 * * All Rights Reserved. * *
 * NOTICE: All information contained herein is, and remains the property of Yaypay Incorporated and its suppliers, if any.
 * The intellectual and technical concepts contained  herein are proprietary to Yaypay Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material  is strictly forbidden unless prior written permission is obtained  from Yaypay Incorporated.
 */

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Author : Bydzovsky Dominik
 * Date Created: 2023/10/03
 */
@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/broken")
    public String broken() {
        return "broken";
    }

    @GetMapping("/alright")
    public String alright() {
        return "alright";
    }
}
