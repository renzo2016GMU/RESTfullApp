package com.readlearncode.dukesbookshop.restserver.infrastructure;

import com.readlearncode.dukesbookshop.restserver.domain.Book;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 * @version 1.0
 */
public interface BookRepository {

    Book saveBook(final Book book);

    Optional<Book> deleteBook(final String id);

    List<Book> getAll();

    Optional<Book> getByISBN(String isbn);

}