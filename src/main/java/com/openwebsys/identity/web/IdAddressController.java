package com.openwebsys.identity.web;

import com.openwebsys.identity.domain.IdAddress;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "idaddresses", formBackingObject = IdAddress.class)
@RequestMapping("/idaddresses")
@Controller
public class IdAddressController {
}
