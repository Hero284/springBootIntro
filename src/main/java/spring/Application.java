package spring;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.model.Book;
import spring.service.BookService;

@SpringBootApplication
public class Application {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setAuthor("author");
            book.setIsbn("isbn");
            book.setPrice(BigDecimal.TEN);
            book.setTitle("title");
            book.setDescription("description");
            book.setCoverImage("coverImage");

            bookService.save(book);
            System.out.println(bookService.findAll());
        };
    }
}
