package mum.swe.democrud.controller;

import mum.swe.democrud.model.Product;
import mum.swe.democrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value="/products", method = RequestMethod.GET)
    public ModelAndView products(){
        List<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products", products);
        modelAndView.setViewName("product/list");
        return modelAndView;
    }

    @RequestMapping(value="/product", method = RequestMethod.GET)
    public String create(Model model){
        model.addAttribute("product", new Product());
        return "product/edit";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String edit(@Valid @ModelAttribute("product") Product product,
                       BindingResult result, Model model)  {

        if (result.hasErrors()) {
            model.addAttribute("errors", result.getAllErrors());
            return "product/edit";
        }
        product = productService.save(product);
        return "redirect:/products";
    }

    @RequestMapping(value="/product/{id}", method = RequestMethod.GET)
    public String view(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findOne(id));
        return "product/edit";
    }

    @RequestMapping(value="/product/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id, Model model){
        productService.delete(id);
        return "redirect:/products";
    }

}
