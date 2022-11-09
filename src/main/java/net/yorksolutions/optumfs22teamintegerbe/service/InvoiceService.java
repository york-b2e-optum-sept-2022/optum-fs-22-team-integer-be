package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.entity.Invoice;
import net.yorksolutions.optumfs22teamintegerbe.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice create(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public Iterable<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Iterable<Invoice> getInvoicesByAccountId(Long accountId) {
        return invoiceRepository.findAllByAccountId(accountId);
    }
}
