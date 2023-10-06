package com.lingesh.stockmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lingesh.stockmanagement.Model.Product;
import com.lingesh.stockmanagement.Service.ProductService;
import com.lingesh.stockmanagement.constant.Api;

@RestController
@RequestMapping(Api.AUTH)
public class ProductController {
    @Autowired
    public ProductService ps;

    @GetMapping("/getproduct")
    public List<Product> get()
    {
        return ps.getProduct();
    }

    @PostMapping("/postproduct")
    public String add(@RequestBody Product pp)
    {
        return ps.postProduct(pp);
    }

    @PutMapping("/update/{pid}")
    public String update(@RequestBody Product pp,@PathVariable int pid)
    {
        pp.setPid(pid);
        return ps.updateProduct(pp);
    }

    @DeleteMapping("/delete/{pid}")
    public String del(@PathVariable int pid)
    {
        return ps.deleteProduct(pid);
    }
}
