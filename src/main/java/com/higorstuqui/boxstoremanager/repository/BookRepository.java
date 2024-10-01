package com.higorstuqui.boxstoremanager.repository;

import com.higorstuqui.boxstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
