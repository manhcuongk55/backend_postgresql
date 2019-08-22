package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.vttek.elecs.entities.Product;
import vn.vttek.elecs.service.ProductService;

@Controller
public class LibraryController {
    
    @Autowired
    private ProductService bookService;
    
    @RequestMapping("book/new")
    public String newProduct(Model model){
        model.addAttribute("book", new Product());
        return "newBook";
    }
   
    @RequestMapping(value = "book", method = RequestMethod.POST)
    public String saveBook(Product book) {
        bookService.saveProduct(book);
        System.out.println("save book");
        return "redirect:/books";
    }
    
    @RequestMapping("book/delete/{id}")
    public String deleteBook(@PathVariable Integer id) {
        bookService.deleteProduct(id);
        return "redirect:/books";
    }
    
    @RequestMapping("book/edit/{id}")
    public String editBook(@PathVariable Integer id, Model model) {
        System.out.println("edit book");
        model.addAttribute("book", bookService.getProductById(id));
        return "newBook";
    }

    @RequestMapping("/books")
    public String bookList(Model model) {
        model.addAttribute("books",this.bookService.listAllProducts());
        return "bookList";
    }

    @RequestMapping(value="/listado", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@ModelAttribute("book1") Product book) {
            ModelAndView model1 = new ModelAndView("success");
            return model1;
	}
    
}
