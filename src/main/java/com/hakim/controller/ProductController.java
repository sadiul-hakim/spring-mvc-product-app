package com.hakim.controller;

import com.hakim.entities.Product;
import com.hakim.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(path = "/addProduct",method = RequestMethod.POST)
    public ModelAndView addProduct(@ModelAttribute Product product, ModelAndView modelAndView){
        this.productService.createProduct(product);

        modelAndView.setViewName("index");
        modelAndView.addObject("products",this.productService.getAllProducts());

        return modelAndView;
    }

    @RequestMapping(path = "/deleteProduct/{pid}",method = RequestMethod.GET)
    public ModelAndView deleteProduct(@PathVariable Long pid, ModelAndView modelAndView){
        this.productService.deleteProduct(pid);

        modelAndView.setViewName("index");
        modelAndView.addObject("products",this.productService.getAllProducts());

        return modelAndView;
    }

    @RequestMapping(path = "/updateProduct",method = RequestMethod.POST)
    public ModelAndView updateProduct(Product product,ModelAndView modelAndView){
        this.productService.createProduct(product);

        modelAndView.setViewName("index");
        modelAndView.addObject("products",this.productService.getAllProducts());
        return modelAndView;
    }


    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}