/*
 *
 * Original Author:  Artie Copeland
 * Last Modified Date: $DateTime: $
 */
package org.yestech.webtop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author $Author: $
 * @version $Revision: $
 */
@Controller
@RequestMapping("/welcome.yes")
public class WelcomeController
{

    @RequestMapping(method = RequestMethod.GET)
    public String welcome()
    {
        return "welcome";
    }
}
