package net.yorksolutions.optumfs22teamintegerbe.repository;

import net.yorksolutions.optumfs22teamintegerbe.entity.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

    Iterable<Invoice> findAllByAccountId(Long accountId);
}
