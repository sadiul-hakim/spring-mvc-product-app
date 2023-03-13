package com.hakim.controller;

import com.hakim.entities.Product;
import com.hakim.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("products",this.productService.getAllProducts());
        return "index";
    }

    @RequestMapping(path = "/add_product",method = RequestMethod.GET)
    public String app_product(){

        return "AddProduct";
    }
    @RequestMapping(path = "/updateProductPage/{pid}",method = RequestMethod.GET)
    public String updateProductPage(@PathVariable Long pid,Model model){
        Product product=this.productService.getProduct(pid);
        model.addAttribute("product",product);
        model.addAttribute("pid",pid);
        return "UpdateProductPage";
    }
}
